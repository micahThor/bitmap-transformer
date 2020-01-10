package Bitmap;

import java.awt.*;

public class BitMap {

    // instance variables
    Color[][] imageMatrix;

    public BitMap(Color[][] imageMatrix) {

        this.imageMatrix = imageMatrix;
    }

    public void blackAndWhite() {

        for (int line = 0; line < this.imageMatrix.length; line++) {

            for (int pixel = 0; pixel < this.imageMatrix[line].length; pixel++) {
                this.imageMatrix[line][pixel] = new Color(0, 0, 0);
                System.out.println(this.imageMatrix[line][pixel]);
            }
        }

    }




}
