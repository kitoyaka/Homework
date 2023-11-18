package Lab6;

import javax.swing.*;
import java.io.IOException;
import javax.imageio.ImageIO;
import java.awt.*;
import java.io.File;
import java.awt.Graphics;
import java.net.URL;

public class DrawImage extends JFrame {
    DrawImage(){
        super("DrawImage");
        setLayout(null);
        setSize(355,300);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    Image myPicture;
    public void paint(Graphics g){
        String imagePath = "photos/firstStokPhoto.png";
        try {
            myPicture = ImageIO.read(new File(imagePath));
        }
        catch(IOException e){
            e.printStackTrace();
            g.setColor(Color.WHITE);
            g.fillRect(0,0,355,300);
            g.setColor(Color.BLACK);
            g.drawString("Зображння не знайдено!",110,120);
        }
        g.drawImage(myPicture,50,10,this);
    }

    public static void main(String[] args){
        new DrawImage();
    }
}
