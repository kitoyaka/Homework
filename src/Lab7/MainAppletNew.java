package Lab7;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import java.awt.Graphics;
import java.awt.Color;

class ComputeLines implements Runnable {
    boolean going = true;
    private final MainAppletNew parent;

    public ComputeLines(MainAppletNew parentObj) {
        parent = parentObj;
    }

    public void compute() {
        int w = parent.getWidth() - 1, h = parent.getHeight() - 1;
        parent.LineCoordinates(
                (int) (Math.random() * w),
                (int) (Math.random() * h),
                (int) (Math.random() * w),
                (int) (Math.random() * h)
        );
    }

    @Override
    public void run() {
        while (going) {
            compute();
            try {
                Thread.sleep(100); // Додаткова затримка для відображення змін
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class MainAppletNew extends JFrame {
    private ComputeLines m_lines = null;
    private int m_lineX1 = 0, m_lineX2 = 0, m_lineY1 = 0, m_lineY2 = 0;

    public synchronized void LineCoordinates(int x1, int y1, int x2, int y2) {
        m_lineX1 = x1;
        m_lineX2 = x2;
        m_lineY1 = y1;
        m_lineY2 = y2;
        this.repaint();
    }

    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(Color.green);
        g.drawLine(m_lineX1, m_lineX2, m_lineY1, m_lineY2);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            MainAppletNew app = new MainAppletNew();
            app.setTitle("Lines Drawing");
            app.setSize(400, 400);
            app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            app.setVisible(true);
            app.startThreads();
        });
    }

    private void startThreads() {
        if (m_lines == null) {
            m_lines = new ComputeLines(this);
            new Thread(m_lines).start();
        }
    }
}