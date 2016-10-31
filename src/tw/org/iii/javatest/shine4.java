package tw.org.iii.javatest;
public class shine4 {
    public static void main(String[] args) {
        double doubleScore = Math.random();
        System.out.println(doubleScore);
        int intScore = (int) (Math.random() * 100 + 1);
        System.out.println(intScore);
            if (intScore >= 90) {
                System.out.println("A");
            } else if (intScore >= 80) {
                System.out.println("B");
            } else if (intScore >= 70) {
                System.out.println("C");
            } else if (intScore >= 60) {
                System.out.println("D");
            } else {
                System.out.println("E");
            }
    }
}

