package tw.org.iii.javatest;

import java.util.HashMap;
import java.util.HashSet;
import java.util.TreeSet;

public class shine50 {
    public static void main(String[] args){
        //TreeSet<Integer> set = new TreeSet();   //泛型 指定int
        HashMap<String,Object> map = new HashMap<>();
        map.put("name", "shine");
        map.put("gender", false);
        map.put("weight", 60);

        System.out.println(map.get("name"));
        System.out.println(map.get("gender"));
        System.out.println(map.get("weight"));
    }
}
