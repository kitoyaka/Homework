package Coursework;
import javax.imageio.ImageIO;
import java.io.IOException;
import java.io.File;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

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
                            switchImageLeft = !switchImageLeft;
                            if (switchImageLeft) {
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
                        firstRightLeverRed = ImageIO.read(new File("photos/firstLeftGreenRightRed.jpeg"));
                        repaint();
                    } catch (IOException ex) {
                        System.out.println("NO PHOTO");
                    }
                     timer = new Timer(2000, new ActionListener() { // 2000 = 2 сек
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            switchImageRight = !switchImageRight;
                            if (switchImageRight) {
                                try {
                                    firstRightLeverRed = ImageIO.read(new File("photos/secondStokPhoto.png"));
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
