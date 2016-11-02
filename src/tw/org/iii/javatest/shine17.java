package tw.org.iii.javatest;
public class shine17 {
    public static void main(String[] args){
        Bike b1 = new Bike();
        Bike b2 = new Bike();
        Bike b3 = new Bike();
        System.out.println(b1.getSpeed());
        int i = 0;
        for(;i<10;i++) {
            b1.upSpeed();
            b1.upSpeed();
            b1.upSpeed();
        }
            System.out.println(b1.getSpeed());
            System.out.println("----");
            System.out.println(b2.getSpeed());
            byte v2 = 4;
            b2.upSpeed(v2);
            b2.upSpeed(v2);
            b2.upSpeed(v2);
            System.out.println(b2.getSpeed());
            System.out.println("----");
            System.out.println(b3.getSpeed());
            b3.upSpeed(4.0);
            b3.upSpeed(4.0);
            b3.upSpeed(4.0);
            System.out.println(b3.getSpeed());


    }
}
