//import ENUMS.KEYBOARD_ARROWS_CONDITION;
//
//import java.awt.event.KeyEvent;
//import java.awt.event.KeyListener;
//
//public class Controls extends DrawPanel implements KeyListener {
//    @Override
//    public void keyTyped(KeyEvent e) { // key char
//    }
//    @Override
//    public void keyPressed(KeyEvent e) { // key int
//        switch(e.getKeyCode()){
//            case 37 -> {
//                 = true;
//                right = false; down = false; up = false;
//            }//left
//            case 38 -> {
//                up = true;
//                right = false; down = false; left = false;
//            }//up
//            case 40 -> {
//                down = true;
//                right = false; up = false; left = false;
//            }//down
//            case 39 -> {
//                right = true;
//                up = false; down = false; left = false;
//            }//right
//        }
//    }
//
//    @Override
//    public void keyReleased(KeyEvent e) { // key when released
//        System.out.println("you typed key int: " + e.getKeyCode());
//    }
//
//}
