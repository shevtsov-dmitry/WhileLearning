import ImagesChanging.ImagesScaller;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class DrawPanel extends JPanel implements ActionListener, KeyListener{
    private final int FIELD_WIDTH = 500;
    private final int FIELD_HEIGHT = 500;
    private final int STEP_LENGTH = 1;
    private int x_head = FIELD_WIDTH / 2;
    private int y_head = FIELD_HEIGHT / 2;
    Image head = new ImagesScaller("src\\resources\\head.png").image; // To make it work it should only be outside of method!!!
    Timer timer = new Timer(10,this);
    ///
    ///
    DrawPanel() {
        this.setPreferredSize(new Dimension(FIELD_WIDTH,FIELD_HEIGHT));
        this.setFocusable(true);
        this.addKeyListener(this);
        timer.start();
    }

    // KeyListener implementations
    @Override
    public void keyTyped(KeyEvent e) { // key char
    }
    boolean right, left, up, down;
    @Override
    public void keyPressed(KeyEvent e) { // key int
        switch(e.getKeyCode()){
            case 37 -> {
                left = true;
                right = false; down = false; up = false;
            }//left
            case 38 -> {
                up = true;
                right = false; down = false; left = false;
            }//up
            case 40 -> {
                down = true;
                right = false; up = false; left = false;
            }//down
            case 39 -> {
                right = true;
                up = false; down = false; left = false;
            }//right
        }
    }

    @Override
    public void keyReleased(KeyEvent e) { // key when released
        System.out.println("you typed key int: " + e.getKeyCode());
    }

    // Drawing
    @Override
    public void paint(Graphics g){
        Graphics2D gg = (Graphics2D) g;
        gg.setPaint(new Color(0x6ED4DE));
        gg.fillRect(0,0,FIELD_WIDTH,FIELD_HEIGHT);
        gg.drawImage(head, x_head, y_head, null);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        // change direction
        if(right) x_head+=STEP_LENGTH;
        if(left) x_head-=STEP_LENGTH;
        if(up) y_head-=STEP_LENGTH;
        if(down) y_head+=STEP_LENGTH;
        // managing the collision with the walls
        if(x_head + ImagesScaller.getIMAGE_WIDTH() == FIELD_WIDTH) x_head = 0;
        //if(x_head - ImagesScaller.getIMAGE_WIDTH() == 0) x_head = FIELD_WIDTH;
        repaint();
    }
}
