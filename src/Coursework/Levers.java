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
                        System.out.println("NO PHOTO");
                    }
                     timer = new Timer(2000, new ActionListener() { // 2000 = 2 сек
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            switchImage = !switchImage;
                            if (switchImage) {
                                try {
                                    firstLeftLeverRed = ImageIO.read(new File("photos/firstLeftLeverGreen.jpeg"));
                                    timer.stop();
                                } catch (IOException ex) {
                                    ex.printStackTrace();
                                    System.out.println("Немає фото");
                                }
                            } else {
                                firstLeftLeverRed = null;
                            }
                            repaint();
                        }
                    });
                    timer.start();
                }
            }
        });
    }
    ////////////////////////////////////////////////////////////////////////////////////////////
    ////////////////////////////////////////////////////////////////////////////////////////////
    public void rightLever() {
        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int x = e.getX();
                int y = e.getY();
                if (x >= 645 && x <= 685 && y >= 140 && y <= 215) {
                    try {
                        firstRightLeverRed = ImageIO.read(new File("photos/firstRightLeverRed.png"));
                        repaint();
                    } catch (IOException ex) {
                        System.out.println("NO PHOTO");
                    }
                     timer = new Timer(2000, new ActionListener() { // 2000 = 2 сек
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            switchImage = !switchImage;
                            if (switchImage) {
                                try {
                                    firstRightLeverRed = ImageIO.read(new File("photos/firstRightLeverGreen.jpeg"));
                                    timer.stop();
                                } catch (IOException ex) {
                                    ex.printStackTrace();
                                    System.out.println("NO PHOTO");
                                }
                            } else {
                                firstRightLeverRed = null; //
                            }
                            repaint();
                        }
                    });
                    timer.start();
                }
            }
        });
    }
}
