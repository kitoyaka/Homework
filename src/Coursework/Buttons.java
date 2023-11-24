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
                if (x >= 350 && x <= 410 && y >= 330 && y <= 480) {
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
}
