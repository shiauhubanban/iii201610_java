package tw.org.iii.javatest;
public class shine23TWId {
    public static void main(String[] args){
        //TWId id1 = new TWId("B120863158");
        TWId id1 = new TWId();
        System.out.println(id1.getId());
        if(TWId.isCheckOk(id1.getId())){
        //if(TWId.isCheckOk("Y120239847")){
            System.out.println("ok");
        }else{
            System.out.println("XX");
        }

    }
}
