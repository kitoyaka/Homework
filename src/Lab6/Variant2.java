package Lab6;

import javax.swing.*;
import java.io.IOException;
import javax.imageio.ImageIO;
import java.awt.*;
import java.io.File;
import java.awt.Graphics;
import java.net.URL;

public class Variant2 extends JFrame {
    Variant2(){
        super("DrawImage");
        setLayout(null);
        setSize(355,300);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    Image myPicture;
    public void paint(Graphics g){
        try {
            myPicture = ImageIO.read(new URL("https://i.pinimg.com/564x/d7/12/e8/d712e82c87d68894113dd169629627e2.jpg"));
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
        new Variant2();
    }
}
