package com.wn.excelapp.tool;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.client.j2se.MatrixToImageConfig;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;

import java.io.ByteArrayOutputStream;
import java.util.Base64;
import java.util.HashMap;
import java.util.Map;

/**
 * @program: excelapp
 * @description: 条形码生成工具
 * @author: JasonWe
 * @create: 2020-11-16 21:16
 **/
public class BarcodeGen2 {

    public static void main(String[] args) throws Exception {
        String content = "123456789";
        Map<EncodeHintType, Object> hints = new HashMap<>();
        hints.put(EncodeHintType.CHARACTER_SET, "UTF-8");
        hints.put(EncodeHintType.MARGIN, 0);
        int onColor = 0xFF000000;     //前景色
        int offColor = 0xBFB0A8;    //背景色
        MatrixToImageConfig config = new MatrixToImageConfig(onColor, offColor);
        BitMatrix bitMatrix = new MultiFormatWriter()
                .encode(content, BarcodeFormat.CODE_128, 300, 100, hints);
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        MatrixToImageWriter.writeToStream(bitMatrix, "png", baos, config);
        System.out.println(Base64.getEncoder().encodeToString(baos.toByteArray()));
    }



}
