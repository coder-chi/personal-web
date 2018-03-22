package com.zczy.personal.web;

import com.zczy.personal.web.util.ImgUtils;
import org.junit.Test;

import java.io.File;

/**
 * @Author: zhangzhiyuan
 * @Date: Created in 2018/2/22 16:45
 */
public class ImgTest {

    @Test
    public void img() {
        File file = new File("img");
        int i = 0;
        for(File f : file.listFiles()) {
            i++;
            if (f.getName().contains("jpeg")||f.getName().contains("jpg"))
                ImgUtils.scale(f.getAbsolutePath(),i + ".jpg", 750, 500);
        }
    }
}
