package tw.org.iii.javatest;
public class shine26 {
    public static void main(String[] args){

    }
}
abstract class shine261{
    void m1(){}
    abstract void m2();
}
interface shine262{  //介面 沒有建構式 , 方法都是public
    int a = 1; //一開始就要給值
    //void m1(){}; //不可以XXX
    void m2();
}
class shine263 implements shine262{
   public void m2(){}  //方法都是public
}