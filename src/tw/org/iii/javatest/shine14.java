package tw.org.iii.javatest;
public class shine14 {
    public static void main(String[] args) {
        int[] p = new int[6];
        for(int i=0;i<100;i++){
            int point = (int)(Math.random()*9); //0-8
            p[point>=6?point-3:point]++;
        }
        for(int i=0; i<p.length; i++) {
            System.out.println((i+1) +"點" + p[i] + "次");
        }



    }
}
