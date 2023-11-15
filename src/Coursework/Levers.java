package Coursework;
import javax.imageio.ImageIO;
import java.io.IOException;
import java.io.File;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.JFrame;

public class Levers extends MainFrame {
    Levers(String s) {
        super(s);
    }
    public void leftLever() {
        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int x = e.getX();
                int y = e.getY();
                if (x >= 370 && x <= 405 && y >= 140 && y <= 215) {
                    try {
                        firstLeftLeverRed = ImageIO.read(new File("photos/firstLeftLeverRed.png"));
                        repaint();
                    } catch (IOException ex) {
                        System.out.println("No photo");
                    }
                }
            }
        });
    }
    public void rightLever(){
        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int x = e.getX();
                int y = e.getY();
                if(x >= 645 && x <= 685 && y >= 140 && y <=215){
                   try{
                       firstRightLeverRed = ImageIO.read(new File("photos/"))
                   }
                }
            }
        });
    }

}
