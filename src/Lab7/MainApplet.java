package Lab7;

import javax.swing.JFrame;
import java.awt.Graphics;
import java.awt.Color;

// Потік для розрахунку координат прямокутника
class ComputeRects extends Thread {
    boolean going = true;
    public ComputeRects(MainApplet parentObj) {
        parent = parentObj;
    }
    public void run() {
        while(going) {
            int w = parent.getWidth() - 1, h = parent.getHeight() - 1;
            parent.RectCoordinates((int)(Math.random() * w), (int)(Math.random() * h));
        }
    }
    MainApplet parent;
}

// Потік для розрахунку координат овалу
class ComputeOvals extends Thread {
    boolean going = true;
    public ComputeOvals(MainApplet parentObj) {
        parent = parentObj;
    }
    public void run() {
        while(going) {
            int w = parent.getWidth() - 1, h = parent.getHeight() - 1;
            parent.OvalCoordinates((int)(Math.random() * w), (int)(Math.random() * h));
        }
    }
    MainApplet parent;
}

public class MainApplet extends JFrame {
    ComputeRects m_rects = null;
    ComputeOvals m_ovals = null;
    int m_rectX = 0; int m_rectY = 0;
    int m_ovalX = 0; int m_ovalY = 0;

    public synchronized void RectCoordinates(int x, int y) {
        m_rectX = x; m_rectY = y;
        this.repaint();
    }

    public synchronized void OvalCoordinates(int x, int y) {
        m_ovalX = x; m_ovalY = y;
        this.repaint();
    }

    public void startThreads() {
        if (m_rects == null) {
            m_rects = new ComputeRects(this);
            m_rects.start();
        }
        if (m_ovals == null) {
            m_ovals = new ComputeOvals(this);
            m_ovals.start();
        }
    }

    public void stopThreads() {
        if (m_rects != null) m_rects.going = false;
        if (m_ovals != null) m_ovals.going = false;
    }

    public MainApplet() {
        setTitle("Shapes Moving");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void paint(Graphics g) {
        super.paint(g);
        int w = this.getWidth(), h = this.getHeight();
        g.clearRect(0, 0, w, h);
        g.setColor(Color.red);
        g.fillRect(m_rectX, m_rectY, 20, 20);
        g.setColor(Color.blue);
        g.fillOval(m_ovalX, m_ovalY, 20, 20);
    }

    public static void main(String[] args) {
        MainApplet app = new MainApplet();
        app.startThreads();
    }
}