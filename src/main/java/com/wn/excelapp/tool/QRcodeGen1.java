package com.wn.excelapp.tool;

import org.apache.avalon.framework.configuration.Configuration;
import org.apache.avalon.framework.configuration.DefaultConfiguration;
import org.krysalis.barcode4j.BarcodeGenerator;
import org.krysalis.barcode4j.BarcodeUtil;
import org.krysalis.barcode4j.output.bitmap.BitmapCanvasProvider;

import java.awt.image.BufferedImage;
import java.io.FileOutputStream;
import java.io.OutputStream;

/**
 * @program: excelapp
 * @description: 生成二维码
 * @author: JasonWe
 * @create: 2020-11-16 21:03
 **/
public class QRcodeGen1 {

    public static void main(String[] args) throws Exception {

        BarcodeUtil util = BarcodeUtil.getInstance();
        BarcodeGenerator gen = util.createBarcodeGenerator(buildCfg("datamatrix"));

        OutputStream fout = new FileOutputStream("qrcode1.png");
        int resolution = 300;
        BitmapCanvasProvider canvas = new BitmapCanvasProvider(fout, "image/png", resolution,
                BufferedImage.TYPE_BYTE_BINARY, false, 0);

        gen.generateBarcode(canvas, "be the coder");
        canvas.finish();
    }

    private static Configuration buildCfg(String type) {
        DefaultConfiguration cfg = new DefaultConfiguration("barcode");

        // Bar code type
        DefaultConfiguration child = new DefaultConfiguration(type);
        cfg.addChild(child);

        // Human readable text position
        DefaultConfiguration attr = new DefaultConfiguration("human-readable");
//		DefaultConfiguration subAttr = new DefaultConfiguration("placement");
//		subAttr.setValue("bottom");
//		attr.addChild(subAttr);
//		child.addChild(attr);
//		datamatrix code has no human-readable part
//		see http://barcode4j.sourceforge.net/2.1/symbol-datamatrix.html

        attr = new DefaultConfiguration("height");
        attr.setValue(250);
        child.addChild(attr);
        attr = new DefaultConfiguration("module-width");
        attr.setValue("0.6");
        child.addChild(attr);
        return cfg;
    }
}
