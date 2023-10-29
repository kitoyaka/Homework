package MyGraph;
import java.awt.*;
import java.awt.event.*;

public class ScribbleTest extends Frame{
    private static final long serialVersionUID = 1L;
    public ScribbleTest (String s){
        super(s);
        ScrollPane pane = new ScrollPane();
        pane.setSize(300,300);
        add(pane, BorderLayout.CENTER);
        Scribble scr = new Scribble(this, 500, 500);
        pane.add(scr);
        Panel p = new Panel();
        add(p, BorderLayout.SOUTH);
        Button b1= new Button("Red");
        p.add(b1);
        b1.addActionListener(scr);
        Button b2 = new Button("Green");
        p.add(b2);
        b2.addActionListener(scr);
        Button b3= new Button("Blue");
        p.add(b3);
        b3.addActionListener(scr);
        Button b4= new Button("Black");
        p.add(b4);
        b4.addActionListener(scr);
        Button b5= new Button("Clean");
        p.add(b5);
        b5.addActionListener(scr);

        addWindowListener(new WindowAdapter() {
            public void windowClosing (WindowEvent e){
                System.exit(0);
            }
        });
        pack();
        setVisible(true);
    }
    public static void main(String[] args){
        new ScribbleTest(" \"Painting\"");
    }
}
