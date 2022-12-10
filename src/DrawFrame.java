import javax.swing.*;
import java.awt.*;

public class DrawFrame extends JFrame {
        DrawPanel panel = new DrawPanel();
    DrawFrame(){
        this.setTitle("Snake");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ImageIcon appIcon = new ImageIcon("src/resources/apple2.png");
        this.setIconImage(appIcon.getImage());
        this.add(panel); // add & pack DrawPanel realisation
        this.pack();

        this.setLocationRelativeTo(null); // center the app on open
        this.setResizable(false);

        this.setVisible(true);
    }
}
