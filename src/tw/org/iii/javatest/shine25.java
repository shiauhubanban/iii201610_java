package tw.org.iii.javatest;
public class shine25 {
    public static void main(String[] args){
        shine251 obj1 = new shine251();
        shine252 obj2 = new shine253();  //shine252功能不清楚 所以不能這麼做
        shine252 obj3 = new shine254();
        obj2.m2();
        obj3.m2();
    }
}
class shine251{
    int a;
    void m1(){}
    void m2(){}
}
abstract class shine252{    //抽象類別 abstract
    int a;
    void m1(){}
    abstract void m2();   //抽象方法 abstract :有定義沒有實作
}
class  shine253 extends shine252{
    void m2(){System.out.println("shine253:m2(){}");} //真的實作出來
}
class  shine254 extends shine252{
    void m2(){System.out.println("shine254:m2(){}");} //真的實作出來
}
