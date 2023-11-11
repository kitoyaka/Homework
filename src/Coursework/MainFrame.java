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
     Timer timer;
     boolean switchImage = false;

    MainFrame(String s) {
        super(s);
        setLayout(null);
        setSize(1024, 800);
        setVisible(true);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        try {
            firstLeftLeverRed = ImageIO.read(new File("photos/firstStokPhoto.png"));
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Зображення не знайдено");
        }
        timer = new Timer(2000, new ActionListener() { //2000 = 2 sec
            @Override
            public void actionPerformed(ActionEvent e) {
                switchImage = !switchImage; // Переключаем значение для смены изображения
                if (switchImage) {
                    try {
                        firstLeftLeverRed = ImageIO.read(new File("photos/firstLeftLeverRedOff.png"));//путь до фотки яка нам треба
                    } catch (IOException ex) {
                        ex.printStackTrace();
                        System.out.println("No photo");
                    }
                } else {
                    firstLeftLeverRed = null; //
                }
                repaint(); //
                timer.stop();
            }
        });

        addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e){
                timer.start();
            }
        });
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
