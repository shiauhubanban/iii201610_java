package tw.org.iii.javatest;
public class shine13 {
    public static void main(String[] args) {
        int p1,p2,p3,p4,p5,p6;
        p1 = p2 = p3 = p4 = p5 = p6 = 0;
        for(int i=0;i<100;i++){
            int point = (int)(Math.random()*6);
            switch (point){
                case 0: p1++;break;
                case 1: p2++;break;
                case 2: p3++;break;
                case 3: p4++;break;
                case 4: p5++;break;
                case 5: p6++;break;
            }
        }
        System.out.println("1點" + p1 + "次");
        System.out.println("2點" + p2 + "次");
        System.out.println("3點" + p3 + "次");
        System.out.println("4點" + p4 + "次");
        System.out.println("5點" + p5 + "次");
        System.out.println("6點" + p6 + "次");


    }
}
