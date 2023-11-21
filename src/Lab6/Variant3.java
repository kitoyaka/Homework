package Lab6;
import javax.swing.*;
import java.awt.*;

public class Variant3 extends JFrame {

    private Image myImage;

    Variant3() {
        super("Variant3");
        setSize(400, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);

        myImage = new ImageIcon("photos/secondStokPhoto.png").getImage();
    }

    public void paint(Graphics g) {
        super.paint(g);

        boolean imageDrawn = g.drawImage(myImage, 0, 0, this);

        if (!imageDrawn) {
            System.out.println("NO PHOTO");
        }
    }

    public static void main(String[] args) {
        new Variant3();
    }
}
