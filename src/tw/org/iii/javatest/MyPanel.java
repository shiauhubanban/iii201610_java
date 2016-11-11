package tw.org.iii.javatest;

import javax.swing.*;
import java.awt.*;

public class MyPanel extends JPanel {  //類別
    @Override  //複寫
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D)g;

        g2d.setColor(Color.RED);  //畫筆顏色
        g2d.setStroke(new BasicStroke(4)); //畫筆粗細

        g2d.drawOval(100,100, 40,40);
        g2d.fillOval(200,200, 40,40);
    }
}
