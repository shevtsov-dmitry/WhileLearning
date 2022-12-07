import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;

public class ImagesScaller extends BufferedImage {
    ImageIcon ia;
    BufferedImage im;
    public ImagesScaller(String path) {
        ia = new ImageIcon(path);
        ia.getImage().getScaledInstance(20,20,Image.SCALE_DEFAULT);
        this.im = (BufferedImage) ia.getImage();
    }
}
