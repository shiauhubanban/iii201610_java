package tw.org.iii.javatest;
public class hwPrimenumber {
    public static void main(String[] args){
        boolean PrimeNumber;
        for(int i=2;i<=100;i++){
            PrimeNumber=true;
            for(int j=2;j<i;j++){
                if(i%j == 0){
                    PrimeNumber=false;
                    break;
                }
            }
            if(PrimeNumber){
                System.out.println(i+"*");
            }else{
                System.out.println(i);
            }
        }
    }
}
