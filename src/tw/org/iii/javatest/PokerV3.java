package tw.org.iii.javatest;
public class PokerV3 {
    public static void main(String[] args){
        //洗牌
        int[] poker = new int[52];
        int Dealer ;
        int i = 0;
        int temp;
        for( ; i<poker.length;i++) {
            poker[i] = i;
            System.out.print(i + " ");
        }
        System.out.println();
            for (int j = 51; j >= 0; j--) {
                temp = (int) (Math.random() * j);
                Dealer = poker[temp];
                poker[temp] =poker[j] ;
                poker[j] = Dealer;
                System.out.print(Dealer + " ");
            }
            System.out.println();


        //發牌
        //攤牌(理牌)
        
    }
}
