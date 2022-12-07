import javax.swing.*;
import java.awt.*;

public class DrawPanel extends JPanel {
    private final int FIELD_WIDTH = 500;
    private final int FIELD_HEIGHT = 500;
    DrawPanel(){
        this.setPreferredSize(new Dimension(FIELD_HEIGHT,FIELD_WIDTH));
    }
    @Override
    public void paint(Graphics g){
        Graphics2D gg = (Graphics2D) g;
        gg.setPaint(new Color(0x6ED4DE));
        gg.fillRect(0,0,FIELD_HEIGHT,FIELD_WIDTH);
    }
}
