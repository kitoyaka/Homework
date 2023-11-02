package Coursework;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.JFrame;
public class MainFrame extends JFrame {

    MainFrame(String s){
        super(s);
        setLayout(null);
        setSize(1024,768);
        setVisible(true);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    public static void main(String[] args){
        new MainFrame("Курсова");

    }

}
