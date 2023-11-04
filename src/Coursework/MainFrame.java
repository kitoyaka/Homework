package Coursework;
import  javax.imageio.ImageIO;
import java.io.IOException;
import java.io.File;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.Graphics;
public class MainFrame extends JFrame {

    MainFrame(String s){
        super(s);
        setLayout(null);
        setSize(1024,800);
        setVisible(true);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    Image firstStokPicture;
    Image firstLeftLeverRed;
    public void firstPhoto(){
        String firstStokPicturePath = "photos/firstStokPhoto.png";
        try {
            firstStokPicture = ImageIO.read(new File(firstStokPicturePath));
        }
        // Оброблення помилки. Якщо фото не буде знайдене по його PATH, вийде помилка IOException.
        // Тому в дужках вказується ТИП помилки і виводиться щось якщо вона станеться.
        catch (IOException e){
            e.printStackTrace();
            getGraphics().drawString("Зображення не знайдено", 110,120);
        }
    }
    public void leftLever(){
        JButton lever1 = new JButton(" ");
        lever1.setBounds(370,140, 35, 75);
        lever1.setVisible(true);
        lever1.setEnabled(true);
        add(lever1);
        lever1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String firstLeftLeverRedPath = "photos/firstLeftLeverRed.png";
                try {
                    firstLeftLeverRed = ImageIO.read(new File(firstLeftLeverRedPath));
                } catch (IOException ex) {
                    ex.printStackTrace();
                    System.out.println("No photo");
                }
                repaint();
            }
        });
    }
    public void paint(Graphics g){
        super.paint(g);
        g.drawImage(firstStokPicture,5,25,this);
        if(firstLeftLeverRed != null){
            g.drawImage(firstLeftLeverRed,5,25,this);
        }
    }
    public static void main(String[] args){
        MainFrame obj = new MainFrame("Курсова");
        obj.firstPhoto();
        obj.leftLever();
    }
}
