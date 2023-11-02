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
    public void firstPhoto(){
        String firstStokPicturePath = "C:/Users/rigry/IdeaProjects/Homework/photos/firstStokPhoto.png";
        try {
            firstStokPicture = ImageIO.read(new File(firstStokPicturePath));
        }
        // Оброблення помилки. Якщо фото не буде знайдене по його PATH, вийде помилка IOException.
        // Тому в дужках вказується ТИП помилки і виводиться щось якщо вона станеться.
        catch (IOException e){
            getGraphics().drawString("Зображення не знайдено", 110,120);
        }
        getGraphics().drawImage(firstStokPicture, 5,25,this);
    }
    public static void main(String[] args){
        MainFrame obj = new MainFrame("Курсова");
        obj.firstPhoto();
    }

}
