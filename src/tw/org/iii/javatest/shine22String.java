package tw.org.iii.javatest;
public class shine22String {
    public static void main(String[] args){
        String s1 = "shine";
        String s2 = "shine";
        String s3 = new String("shine");
        String s4 = new String("shine");
        System.out.println(s1 == s3);       //比較位置是否相同
        System.out.println(s1.equals(s3)); //比較內容物是否相同
        System.out.println("--------");
        Pen p1 = new Pen();
        Pen p2 = new Pen();
        System.out.println(p1.equals(s2));  //pen套用到object 所以不相同 要改原本程式
        System.out.println("--------");
        String s5 = s3 ;
        System.out.println(s5 == s3);
        System.out.println(s3.concat("III")); //加寫上去
        System.out.println(s3);               //內容一樣
        System.out.println("--------");
        System.out.println(p1);
        System.out.println(p2);
    }
}
class Pen extends Object{
    @Override
    public String toString() {
        return "I have an Apple";
    }

    @Override
    public boolean equals(Object o) {
        return true;
    }
}