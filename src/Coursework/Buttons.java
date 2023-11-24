package Coursework;
import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.IOException;

public class Buttons extends MainFrame{

    public void firstButton(){
        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int x = e.getX();
                int y = e.getY();
                if (x >= 350 && x <= 410 && y >= 330 && y <= 380) {
                    try{
                        thirdFirstOn = ImageIO.read(new File("photos/thirdFirstOn.png"));
                        repaint();
                    } catch (IOException ex){
                        System.out.println("NO PHOTO");
                    }
                }
            }
        });
    }
    public void secondButton(){
        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int x = e.getX();
                int y = e.getY();
                if (x >= 440 && x <= 500 && y >= 330 && y <= 380) {
                    try{
                        thirdFirstSecondOn = ImageIO.read(new File("photos/thirdFirstSecondOn.png"));
                        repaint();
                    } catch (IOException ex){
                        System.out.println("NO PHOTO");
                    }
                }
            }
        });
    }
    public void thirdButton(){

        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int x = e.getX();
                int y = e.getY();
                if (x >= 540 && x <= 620 && y >= 350 && y <= 420) {
                    try{
                        thirdFirstSecondThirdOn = ImageIO.read(new File("photos/thirdFirstSecondThirdOn.png"));
                        repaint();
                    } catch (IOException ex){
                        System.out.println("NO PHOTO");
                    }
                }
            }
        });
    }
    public void fourthButton(){

        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int x = e.getX();
                int y = e.getY();
                if (x >= 640 && x <= 700 && y >= 350 && y <= 420) {
                    try{
                        thirdAllOn = ImageIO.read(new File("photos/thirdAllOn.png"));
                        repaint();
                    } catch (IOException ex){
                        System.out.println("NO PHOTO");
                    }
                }
            }
        });
    }

}
