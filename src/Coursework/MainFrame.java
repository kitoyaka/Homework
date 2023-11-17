package Coursework;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.io.IOException;
import javax.swing.*;

public class MainFrame extends JFrame {
     Image firstStokPicture;
     Image firstLeftLeverRed;
     Image firstRightLeverRed;
     Image secondLeftCapOff;
     Timer timer;
     boolean switchLeftImageLeft = false;
     boolean switchLeftImageRight = false;
     boolean switchRightImageLeft = false;
     boolean switchRightImageRight = false;

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
        if(firstRightLeverRed != null){
            g.drawImage(firstRightLeverRed,5,25,this);
        }
        if(secondLeftCapOff != null){
            g.drawImage(secondLeftCapOff, 5,25,this);
        }
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Levers levers = new Levers("Курсова");
            levers.leftLever();
            levers.rightLever();
            levers.leftCap();
        });
    }
}
