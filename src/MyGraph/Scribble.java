package MyGraph;

import java.awt.*;
import java.awt.event.*;

public class Scribble extends Component implements ActionListener, MouseListener, MouseMotionListener {
    private static final long serialVersionUID = 1L;
    protected int lastX, lastY, w, h;
    protected Color currColor = Color.BLACK;
    protected Frame f;

    public Scribble(Frame frame, int width, int height) {
        f = frame;
        w = width;
        h = height;
        enableEvents(AWTEvent.MOUSE_EVENT_MASK | AWTEvent.MOUSE_MOTION_EVENT_MASK);
        addMouseListener(this);
        addMouseMotionListener(this);
    }

    public Dimension getPreferredSize() {
        return new Dimension(w, h);
    }

    public void actionPerformed(ActionEvent event) {
        String s = event.getActionCommand();
        if (s.equals("Очистити")) repaint();
        else if (s.equals("Красний")) currColor = Color.RED;
        else if (s.equals("Зелений")) currColor = Color.green;
        else if (s.equals("Синій")) currColor = Color.BLUE;
        else if (s.equals("Чорний")) currColor = Color.BLACK;
    }

    public void mousePressed(MouseEvent e) {
        lastX = e.getX();
        lastY = e.getY();
    }

    public void mouseDragged(MouseEvent e) {
        Graphics g = getGraphics();
        g.setColor(currColor);
        g.drawLine(lastX, lastY, e.getX(), e.getY());
        lastX = e.getX();
        lastY = e.getY();
    }

    public void mouseReleased(MouseEvent e) {
    }

    public void mouseClicked(MouseEvent e) {
    }

    public void mouseEntered(MouseEvent e) {
    }

    public void mouseExited(MouseEvent e) {
    }

    public void mouseMoved(MouseEvent e) {
    }
}