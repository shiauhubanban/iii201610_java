package tw.org.iii.javatest;
public class shine9 {
    public static void main(String[] args){
        int i =0;
        //for (首次執行敘述句 ; 執行前的判斷; 執行後的敘述句){
        for (m1(); ; System.out.println("----")) {
            if(i>=10) break;
            System.out.println(i++);
        }
    }
    static void m1(){
        System.out.println("shine");
        for(int i=0;i<10;i++){
            System.out.print(i);
        }
    }
}
