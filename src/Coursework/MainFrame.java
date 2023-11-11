package Coursework;
import javax.imageio.ImageIO;
import java.io.IOException;
import java.io.File;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.JFrame;



public class MainFrame extends JFrame {
    Image firstStokPicture;
    Image firstLeftLeverRed;

    MainFrame(String s) {
        super(s);
        setLayout(null);
        setSize(1024, 800);
        setVisible(true);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        try {
            firstStokPicture = ImageIO.read(new File("photos/firstStokPhoto.png"));
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Зображення не знайдено");
        }
    }
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.drawImage(firstStokPicture, 5, 25, this);
        if (firstLeftLeverRed != null) {
            g.drawImage(firstLeftLeverRed, 5, 25, this);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            MainFrame obj = new MainFrame("Курсова");
            Levers levers = new Levers(" ");
            levers.leftLever();
        });
    }
}
