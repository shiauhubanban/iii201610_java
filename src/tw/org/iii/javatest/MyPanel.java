package tw.org.iii.javatest;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.util.HashMap;
import java.util.LinkedList;

public class MyPanel extends JPanel{  //類別
     private LinkedList<LinkedList<HashMap<String ,Integer>>> lines = null;  //很多條線
     //private MyMouseListener myMouseListener;

     public MyPanel(){
         MyMouseListener myMouseListener = new MyMouseListener();
         addMouseMotionListener(myMouseListener);
         addMouseListener(myMouseListener);
         lines = new LinkedList<>();
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
        //System.out.println("paintComponent()");
        Graphics2D g2d = (Graphics2D)g;
        setBackground(Color.BLACK);
        g2d.setColor(Color.YELLOW);  //畫筆顏色
        g2d.setStroke(new BasicStroke(2)); //畫筆粗細

        for(LinkedList<HashMap<String ,Integer>> line :lines){
            // line(4) =>0-1, 1-2, 2-3,
            for(int i = 1; i<line.size(); i++){
                HashMap<String,Integer> p0 = line.get(i-1);
                HashMap<String,Integer> p1 = line.get(i);
                g2d.drawLine(p0.get("x"),p0.get("y"),
                        p1.get("x"),p1.get("y"));
            }
            // g2d.drawOval(100,100, 40,40);
            // g2d.fillOval(200,200, 40,40);
            // g2d.drawLine(0,0, 300,300);
        }

    }

    private  class  MyMouseListener extends MouseAdapter{ //類別中的類別  內部類別
        @Override
        public void mousePressed(MouseEvent e) {
            //super.mousePressed(e); 什麼都沒做
            LinkedList<HashMap<String ,Integer>> line = new LinkedList<>();
            int x = e.getX(); int y = e.getY();
            HashMap<String,Integer> point = new HashMap<>();  //建立出來的
            point.put("x", x); point.put("y", y);  //放進去
            line.add(point);
            lines.add(line);
        }

        @Override
        public void mouseDragged(MouseEvent e) {
            int x = e.getX(); int y = e.getY();
            HashMap<String,Integer> point = new HashMap<>();  //建立出來的
            point.put("x", x); point.put("y", y);  //放進去
            lines.getLast().add(point);
            repaint();
            // System.out.println( x + " x " + y);  //抓點的位置
        }
    }
    void clear(){      //對外提供
        lines.clear();
        repaint();
    }
}
