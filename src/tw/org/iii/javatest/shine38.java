package tw.org.iii.javatest;

import java.io.*;

public class shine38 {
    public  static  void main(String[] args){
        //序列化
        shine383 obj = new shine383();
        try {
            ObjectOutputStream oout = new ObjectOutputStream(
                    new FileOutputStream("dir1/brad.o3")) ;
            oout.writeObject(obj);
            oout.flush();
            oout.close();
        } catch (Exception ee) {System.out.println(ee.toString());}
        System.out.println("-------------");

            //解序列化
            try {
                ObjectInputStream oin = new ObjectInputStream(
                        new FileInputStream("dir1/brad.o3"));
                shine383 obj3 = (shine383)oin.readObject();
                oin.close();
                System.out.println("OK");
            } catch (Exception e) {System.out.println(e.toString());

            }
    }
}
class shine381{
    shine381(){System.out.println(("shine381()"));}
}
class shine382 extends shine381{
    shine382(){System.out.println(("shine382()"));}
}
class shine383 extends shine382 implements Serializable{  //實作可續列化
    shine384 obj;
    shine383(){obj = new shine384() ; System.out.println(("shine383()"));}
}
class shine384 implements Serializable{}  //屬性也要實作序列化