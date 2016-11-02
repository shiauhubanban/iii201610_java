package tw.org.iii.javatest;
public class shine18 {
    public static void main(String[] args){
        shine181 b1 = new shine181(); //建構式
        shine181 b2 = new shine181();
        System.out.println(b2.getA());
        System.out.println("Game over");
    }
}
class shine181{
    int a;
    shine181(){ //建構式
        a = 12;
        System.out.println("shine181");
    }
    int getA(){
        return a;
    }
}
