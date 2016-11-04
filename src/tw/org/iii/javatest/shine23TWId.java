package tw.org.iii.javatest;
public class shine23TWId {
    public static void main(String[] args){
        TWId id1 = new TWId("A123456789");
        if(id1.isCheckOk()){
            System.out.println("ok");
        }else{
            System.out.println("XX");
        }

    }
}
