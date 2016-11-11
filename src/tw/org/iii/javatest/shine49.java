package tw.org.iii.javatest;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.TreeSet;

public class shine49 {
    public static void main(String[] args){
        TreeSet set = new TreeSet(); //有排序
       // HashSet set = new HashSet(); //set 不重複 沒有順序
        while(set.size()<6){
            set.add((int)(Math.random()*49+1));
        }
//        set.add(12);
//        set.add("shine");
//        set.add(34);
//        set.add("andy");
//        set.add(12);
//        set.add("andy");
        System.out.println(set.toString());
        System.out.println("------------");
        LinkedList list = new LinkedList(); //有順序 可重複
        list.add(1);  //0
        list.add(2);      //1
        list.add(3);     //2
        list.add(4);      //3
        list.add(5);    //4
        System.out.println(list.toString());


    }
}
