package Bitmap;


import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class BitMap {

    BufferedImage img;

    public BitMap(BufferedImage img) {
        this.img = img;
    }

    public void setInverted() {
        for (int i = 0; i < img.getWidth(); i++) {
            for (int j = 0; j < img.getHeight(); j++) {
                int nextColor = img.getRGB(j, i);
                img.setRGB(i, j, nextColor);
            }
        }
    }


    public void saveImg() {
        try {
            File outputFile = new File("src/main/resources/savedImg.bmp");
            ImageIO.write(img, "bmp", outputFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}




