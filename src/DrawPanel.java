import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;

public class DrawPanel extends JPanel {
    private final int FIELD_WIDTH = 500;
    private final int FIELD_HEIGHT = 500;
    Image head = new ImagesScaller("src\\resources\\head.png").image; // To make it work it should only be outside of method!!!

    DrawPanel(){
        this.setPreferredSize(new Dimension(FIELD_HEIGHT,FIELD_WIDTH));
    }

    @Override
    public void paint(Graphics g){
        Graphics2D gg = (Graphics2D) g;
        gg.setPaint(new Color(0x6ED4DE));
        gg.fillRect(0,0,FIELD_HEIGHT,FIELD_WIDTH);
        gg.drawImage(head, 0, 0, null);
    }
}
