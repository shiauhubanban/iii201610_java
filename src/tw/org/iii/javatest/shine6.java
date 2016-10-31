package tw.org.iii.javatest;

import javax.swing.*;
import java.util.Scanner;

public class shine6 {
    public static void main(String[] args) {
        String strScore = JOptionPane.showInputDialog("輸入成績");
        int intScore = Integer.parseInt(strScore);
        //Scanner scanner = new Scanner(System.in);
       // int intScore = scanner.nextInt();  //等候輸入
        System.out.println(intScore);
        if (intScore >= 90) {
            JOptionPane.showMessageDialog(null, "A");
            //System.out.println("A");
        } else if (intScore >= 80) {
            JOptionPane.showMessageDialog(null, "B");
            //System.out.println("B");
        } else if (intScore >= 70) {
            JOptionPane.showMessageDialog(null, "C");
            //System.out.println("C");
        } else if (intScore >= 60) {
            JOptionPane.showMessageDialog(null, "D");
            //System.out.println("D");
        } else {
            JOptionPane.showMessageDialog(null, "E");
            //System.out.println("E");
        }
    }
}

