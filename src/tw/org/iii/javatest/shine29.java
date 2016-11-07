package tw.org.iii.javatest;
public class shine29 {
    public static void main(String[] args){
        Bird b1 = new Bird();
        try {
            b1.setLeg(-1);
              } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
class Bird{
    private int leg;
    void setLeg(int n) throws Exception {  //會拋出例外
        if (n<0 || n>2){
            throw new RuntimeException();
        }
        leg = n;
    }
}