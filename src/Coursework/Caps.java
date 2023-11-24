package Coursework;
import javax.imageio.ImageIO;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.IOException;

public class Caps extends Buttons {

public void leftCap() {
    addMouseListener(new MouseAdapter() {
        @Override
        public void mouseClicked(MouseEvent e) {
            int x = e.getX();
            int y = e.getY();
            if (x >= 370 && x <= 405 && y >= 80 && y <= 140) {
                try {
                    secondLeftCapOff = ImageIO.read(new File("photos/secondLeftCapOff.png"));
                    repaint();
                } catch (IOException ex) {
                    System.out.println("NO PHOTO");
                }
            }
        }


    });
    addMouseListener(new MouseAdapter() {
        @Override
        public void mouseClicked(MouseEvent e) {
            int x = e.getX();
            int y = e.getY();
            if (x >= 645 && x <= 685 && y >= 80 && y <= 140) {
                try {;
                    secondLeftCapOff = ImageIO.read(new File("photos/thirdStokPhoto.png"));
                    repaint();
                } catch (IOException ex) {
                    System.out.println("NO PHOTO");
                }
            }
        }
    });
}
    public void rightCap() {
        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int x = e.getX();
                int y = e.getY();
                if (e.getButton() == MouseEvent.BUTTON3 && x >= 645 && x <= 685 && y >= 80 && y <= 140) {
                    try {;
                        secondRightCapOff = ImageIO.read(new File("photos/secondRightCapOff.png"));
                        repaint();
                    } catch (IOException ex) {
                        System.out.println("NO PHOTO");
                    }
                }
            }
        });
        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int x = e.getX();
                int y = e.getY();
                if (e.getButton() == MouseEvent.BUTTON3 && x >= 370 && x <= 405 && y >= 80 && y <= 140) {
                    try {
                        secondRightCapOff = ImageIO.read(new File("photos/thirdStokPhoto.png"));
                        repaint();
                    } catch (IOException ex) {
                        System.out.println("NO PHOTO");
                    }
                }
            }
        });
    }
}
