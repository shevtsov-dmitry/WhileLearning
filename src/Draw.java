import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Draw extends JFrame{
    public Draw() throws HeadlessException {
        this.setTitle("Snake");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(500,500);
        this.getContentPane().setBackground(new Color(0xFFF135));
        this.setVisible(true);
        ImageIcon appIcon = new ImageIcon("src/resources/apple2.png");
        this.setIconImage(appIcon.getImage());
    }
}