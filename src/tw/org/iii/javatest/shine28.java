package tw.org.iii.javatest;
//Exception : 例外/異常
public class shine28 {
    public static void main(String[] args){
     int a = 10,b = 0;
     int[] d = {0,1,2,3};
     try{
         System.out.println(d[4]);
         int c = a/b;
     }catch (ArithmeticException ae){
         System.out.println("OK1");
     }catch (ArrayIndexOutOfBoundsException ae){
         System.out.println("OK2");
     }catch (RuntimeException ae){
         System.out.println("OK3");
     }



     System.out.println("Game Over");
    }
}
