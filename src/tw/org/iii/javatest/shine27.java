package tw.org.iii.javatest;

import javax.swing.*;
import java.awt.*;

public class shine27 extends JFrame {
    private JButton newFile, openFile, saveFile, saveAsFile, exit;
    private JTextArea editor;

    public shine27(){ //只會執行第一次
        //super();
        super("視窗練習");
        setLayout(new BorderLayout());

        newFile = new JButton("New File");
        openFile = new JButton("Open File");
        saveFile = new JButton("Save File");
        saveAsFile = new JButton("Save as File");
        exit = new JButton("Exit");
        editor = new JTextArea();

        JPanel top = new JPanel(new FlowLayout());
        top.add(newFile);top.add(openFile);top.add(saveFile);
        top.add(saveAsFile);top.add(exit);

        add(top,BorderLayout.NORTH);
        add(editor, BorderLayout.CENTER);

        setSize(640,480);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }
    public static void main(String[] args){
        new shine27();
    }
}
