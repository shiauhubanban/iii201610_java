package tw.org.iii.javatest;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class shine27 extends JFrame implements ActionListener{
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

        newFile.addActionListener(new MyLister());
        newFile.addActionListener(this);
        newFile.addActionListener(new ActionListener() {
              @Override
              public void actionPerformed(ActionEvent actionEvent) {
                  System.out.println("C");
              }
          });

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

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        System.out.println("B");
    }
}
class MyLister implements ActionListener{
    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        System.out.println("A");
    }
}