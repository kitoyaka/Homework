package Lab4.Sumator;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Sumator extends JFrame {
    JTextField textField1;
    JTextField textField2;
    JTextField textField3;
    Sumator(String s){
        super(s);
        setLayout(null);
        setSize(250,150);
        setVisible(true);
        setResizable(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        pole1();
        pole2();
        pole3();
        button();
    }
    public void pole1(){
        textField1 = new JTextField("");
        textField1.setBounds(10,10,120,20);
        add(textField1);
    }
    public void pole2(){
        textField2 = new JTextField("");
        textField2.setBounds(10,35,120,20);
        add(textField2);
    }
    public void pole3(){
        textField3 = new JTextField("Результат");
        textField3.setBounds(10,65,120,20);
        add(textField3);
    }
    public void button(){
        Button b1= new Button("Розрахувати");
        b1.setBounds(150,33,80,20);
        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String text1 = textField1.getText();
                String text2 = textField2.getText();
                int number1 = Integer.parseInt(text1);
                int number2 = Integer.parseInt(text2);
                textField3.setText(String.valueOf(number1 + number2));
            }
        });
        add(b1);
    }
    public static void main(String[] args){
        new Sumator("Суматор");
    }
}
