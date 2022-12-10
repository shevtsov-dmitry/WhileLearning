package ImagesChanging;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;


public class ImagesScaller  {
    public static int getIMAGE_HEIGHT() {
        return IMAGE_HEIGHT;
    }

    public static int getIMAGE_WIDTH() {
        return IMAGE_WIDTH;
    }

    private static final int IMAGE_HEIGHT = 30;
    private static final int IMAGE_WIDTH = 30;
    public Image image;
    public ImagesScaller(String path) {
        ImageIcon ia = new ImageIcon(path);
        image = ia.getImage().getScaledInstance(IMAGE_WIDTH,IMAGE_HEIGHT,Image.SCALE_DEFAULT);
        this.image = image;
    }
}
