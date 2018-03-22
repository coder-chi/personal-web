package com.zczy.personal.web.util;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.geom.AffineTransform;
import java.awt.image.AffineTransformOp;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;

/**
 * @Author: zhangzhiyuan
 * @Date: Created in 2018/2/11 17:01
 */
public class ImgUtils {

    /**
     * 缩放图片方法
     * @param srcImageFile
     * @param result
     * @param height
     * @param width
     */
    public static final void scale(String srcImageFile, String result, int height, int width){
        try {
            HashMap<Integer,Integer> map = new HashMap<>();
            //缩放比例
            double ratio = 0.0;

            File file = new File(srcImageFile);
            BufferedImage bufferedImage = ImageIO.read(file);
            //BufferedImage 选择图像平滑度比缩放速度具有更高优先级的图像缩放算法
            Image itemp = bufferedImage.getScaledInstance(width, height, BufferedImage.SCALE_SMOOTH);

            if((bufferedImage.getHeight() > height) || (bufferedImage.getWidth() > width)) {
                double ratioHeight = (double)height / bufferedImage.getWidth();
                double ratioWidth = (double)width / bufferedImage.getWidth();
                if(ratioHeight > ratioWidth){
                    ratio = ratioHeight;
                } else {
                    ratio = ratioWidth;
                }
                //仿射转换
                AffineTransformOp op = new AffineTransformOp(AffineTransform.getScaleInstance(ratio, ratio), null);
                //转换源 BufferedImage 并将结果存储在目标BufferedImage中
                itemp = op.filter(bufferedImage, null);
            }
            ImageIO.write((BufferedImage) itemp, "JPEG", new File(result));

        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
