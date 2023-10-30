package My_Applet;

import javax.swing.*;
import java.awt.*;

public class My_Applet extends JFrame{
    public void paint(Graphics g) {
        g.drawString("Hello, World!", 15,60);
    }

    public static void main(String[] args) {
        My_Applet frame = new My_Applet();
        frame.setSize(200,100);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
