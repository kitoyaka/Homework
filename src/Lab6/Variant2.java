package Lab6;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;

public class Variant2 extends JFrame {
    private BufferedImage myPicture;

    Variant2() {
        super("Variant2");
        setLayout(null);
        setSize(355, 300);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public void paint(Graphics g) {
        super.paint(g); // Очищаем окно

        try {
            // Загрузка изображения в BufferedImage
            myPicture = ImageIO.read(new URL("https://i.pinimg.com/564x/d7/12/e8/d712e82c87d68894113dd169629627e2.jpg"));

            // Отображение изображения
            g.drawImage(myPicture, 50, 10, this);
        } catch (IOException e) {
            e.printStackTrace();

            // В случае ошибки отображаем сообщение
            g.setColor(Color.WHITE);
            g.fillRect(0, 0, 355, 300);
            g.setColor(Color.BLACK);
            g.drawString("Изображение не найдено!", 110, 120);
        }
    }

    public static void main(String[] args) {
        new Variant2();
    }
}
