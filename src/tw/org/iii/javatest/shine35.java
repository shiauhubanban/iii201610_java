package tw.org.iii.javatest;
public class shine35 {
    public static void main(String[] args){
        shine353 obj1= new shine353();
        shine353 obj2= new shine353();
        shine353.m2();
    }
}
class shine351{
    //int a;
    static {System.out.println("shine351:static{...}");} //只會載入一次
    {
        System.out.println("shine351:{...}:a =");//+ a); //建構式初始化之前執行
    }
    shine351(){System.out.println("shine351");}
    void m1(){System.out.println("shine351:m1()");}
    static void m2(){System.out.println("shine351:m2()");}
}
class shine352 extends shine351{
    static {System.out.println("shine352:static{...}");} //只會載入一次
    {
        System.out.println("shine352:{...}:a"); //建構式初始化之前執行
    }
    shine352(){System.out.println("shine352");}
    void m1(){System.out.println("shine352:m1()");}
    static void m2(){System.out.println("shine352:m2()");}
}
class shine353 extends shine352{
    static {System.out.println("shine353:static{...}");} //只會載入一次
    {
        System.out.println("shine353:{...}:a "); //建構式初始化之前執行
    }
    shine353(){System.out.println("shine353");}
    void m1(){System.out.println("shine353:m1()");}
    static void m2(){System.out.println("shine353:m2()");}
}