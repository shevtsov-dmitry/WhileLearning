import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;

public class ImagesScaller{
    private final int IMAGE_HEIGHT = 20;
    private final int IMAGE_WIDTH = 20;
    Image image;
    public ImagesScaller(String path) {
    ImageIcon ia = new ImageIcon(path);
        image = ia.getImage().getScaledInstance(IMAGE_HEIGHT,IMAGE_WIDTH,Image.SCALE_DEFAULT);
        this.image = image;
    }
}
