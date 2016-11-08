package tw.org.iii.javatest;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

public class shine27 extends JFrame implements ActionListener{
    private JButton newFile, openFile, saveFile, saveAsFile, exit;
    private JTextArea editor;
    private File editFile;

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

       // newFile.addActionListener(new MyLister());
       // newFile.addActionListener(this);
        newFile.addActionListener(new ActionListener() {
              @Override
              public void actionPerformed(ActionEvent actionEvent) {
                 newFile();  //按control可跳到所需位置
              }
          });

        openFile.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                openFile();
            }
        });

        saveFile.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                saveFile();
            }
        });



        JPanel top = new JPanel(new FlowLayout());
        top.add(newFile);top.add(openFile);top.add(saveFile);
        top.add(saveAsFile);top.add(exit);

        add(top,BorderLayout.NORTH);
        JScrollPane jsp = new JScrollPane(editor);
        add(jsp, BorderLayout.CENTER);

        setSize(640,480);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }
    public static void main(String[] args){
        new shine27();
    }
    //產生新檔案
    private void newFile (){
        editFile = null;
        editor.setText("");
    }
    //開起舊檔
    private void openFile(){
        JFileChooser jfc = new JFileChooser();
        if(jfc.showOpenDialog(this) == JFileChooser.APPROVE_OPTION){
            editFile = jfc.getSelectedFile();
            loadFile();
           // System.out.println(editFile.getAbsolutePath());
        }
    }
    //讀檔案
    private void loadFile(){
        try {
            StringBuffer sb = new StringBuffer();
            BufferedReader br = new BufferedReader(new FileReader(editFile));
            String line;
            while ((line = br.readLine()) != null){
                sb.append(line + "\n");
            }
            br.close();
            editor.setText(sb.toString());
        } catch (Exception e) {

        }

    }
    //存檔
    private void saveFile(){
        if(editFile == null){
             saveAsFile();
        }else {
            saveRealFile();
        }
    }

    private void saveAsFile(){
        JFileChooser jfc = new JFileChooser();
        if (jfc.showSaveDialog(null) == JFileChooser.APPROVE_OPTION){
            editFile = jfc.getSelectedFile();
            saveRealFile();
        }
    }
    private void saveRealFile(){
        try{
            BufferedWriter bw = new BufferedWriter(new FileWriter(editFile));
            bw.write(editor.getText());
            bw.flush();
            bw.close();
        }catch(IOException e) {
            e.printStackTrace();
        }
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