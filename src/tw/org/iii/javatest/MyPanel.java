package tw.org.iii.javatest;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

public class MyPanel extends JPanel implements MouseMotionListener {  //類別

     public MyPanel(){
         addMouseMotionListener(this); 
     }
//        System.out.println("MyPaint()");
//    }
//    @Override
//    public void paint(Graphics g) {
//        super.paint(g);
//        System.out.println("paint()");
//    }

    @Override  //複寫
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        System.out.println("paintComponent()");

        Graphics2D g2d = (Graphics2D)g;

        setBackground(Color.BLACK);

        g2d.setColor(Color.YELLOW);  //畫筆顏色
        g2d.setStroke(new BasicStroke(2)); //畫筆粗細

       // g2d.drawOval(100,100, 40,40);
       // g2d.fillOval(200,200, 40,40);
        // g2d.drawLine(0,0, 300,300);
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        int x = e.getX(); int y = e.getY();
        System.out.println( x + " x " + y);  //抓點的位置
    }

    @Override
    public void mouseMoved(MouseEvent e) {

    }
}
