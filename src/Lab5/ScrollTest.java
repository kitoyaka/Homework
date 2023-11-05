package Lab5;

import java.awt.Scrollbar;
import java.awt.*;
import java.awt.event.*;
class ScrollTest extends Frame{
    Scrollbar sbRed = new Scrollbar(Scrollbar.VERTICAL, 127,10,0,225);
    Scrollbar sbGreen = new Scrollbar(Scrollbar.VERTICAL, 127,10,0,225);
    Scrollbar sbBlue = new Scrollbar(Scrollbar.VERTICAL, 127,10,0,225);
    Color mixedColor = new Color(127,127,127);
    Label lm = new Label();
    Button b1 = new Button("Apply");
    Button b2 = new Button("Cancel");
    ScrollTest(String s){
        super(s);
        setLayout(null);
        setFont(new Font("Serif", Font.BOLD,15));
        Panel p = new Panel();
        p.setLayout(null);
        p.setBounds(10,100,150,260);
        add(p);
        Label lc =new Label("Choose color");
        lc.setBounds(20,0,120,30);
        p.add(lc);
        Label lmin = new Label("0", Label.RIGHT);
        lmin.setBounds(0,30,30,30);
        p.add(lmin);
        Label lmiddle = new Label("127", Label.RIGHT);
        lmiddle.setBounds(0,120,30,30);
        p.add(lmiddle);
        Label lmax = new Label("225", Label.RIGHT);
        lmax.setBounds(0,200,30,30);
        p.add(lmax);
        sbRed.setBackground(Color.RED);
        sbRed.setBounds(40,30,20,200);
        p.add(sbRed);
        sbGreen.setBackground(Color.GREEN);
        sbGreen.setBounds(70,30,20,200);
        p.add(sbGreen);
        sbBlue.setBackground(Color.BLUE);
        sbBlue.setBounds(100,30,20,200);
        Label lp = new Label("Example");
        lp.setBounds(250,50,120,30);
        add(lp);
        lm.setBackground(new Color(127,127,127));
        lm.setBounds(220,80,120,80);
        add(lm);
        b1.setBounds(240,200,100,30);
        add(b1);
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lm.setBackground(new Color(sbRed.getValue(),sbGreen.getValue(),sbBlue.getValue()));
            }
        });
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lm.setBackground(new Color(127,127,127));
            }
        });
        setSize(400,300);
        setVisible(true);
    }


    public static void main(String[] args){
        Frame f = new ScrollTest(" Color Pick ");
        f.addWindowListener(new WindowAdapter() {
            public  void windowClosing(WindowEvent ev){
                System.exit(0);
            }
        });
    }
}

//