package tw.org.iii.javatest;

import javax.swing.*;

public class shine20 extends JFrame {
    public shine20(){
        //super();
        super("我的視窗程式");
        setSize(640,480);
        setVisible(true);
        System.out.println("shine20");
    }
    public static void main(String[] args){
        shine20 b1 = new shine20();
    }
}
