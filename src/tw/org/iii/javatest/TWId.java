package tw.org.iii.javatest;

public class TWId {
    private String id;

    public TWId(){

    }
    public TWId(char area){

    }
    public TWId(boolean isMale){

    }
    public TWId(char area, boolean isMale){

    }
    public TWId(String id){
        this.id = id;
    }

    public  boolean isCheckOk(){
        String letters = "ABCDEFGHJKLMNPQRSTUVXYWZIO";   // 按照身分證規則
        boolean ret = false;
        if(ret = id.matches("^[A-Z][12][0-9]{8}$")){    //正規表示法
            //編碼規則
            char c0 = id.charAt(0);
            int p0 = letters.indexOf(c0) + 10;
            //System.out.println(p0);
            int n1 = p0 / 10;
            int n2 = p0 % 10;
            int n3 = Integer.parseInt(id.substring(1,2));
            int n4 = Integer.parseInt(id.substring(2,3));
            int n5 = Integer.parseInt(id.substring(3,4));
            int n6 = Integer.parseInt(id.substring(4,5));
            int n7 = Integer.parseInt(id.substring(5,6));
            int n8 = Integer.parseInt(id.substring(6,7));
            int n9 = Integer.parseInt(id.substring(7,8));
            int n10 = Integer.parseInt(id.substring(8,9));
            int n11 = Integer.parseInt(id.substring(9,10));
            int sum = n1*1 + n2*9 + n3*8 + n4*7+ n5*6 +n6*5 +
                    n7*4 + n8*3 +n9*2 + n10*1 + n11*1;
            //System.out.println(sum);
            ret = sum % 10 == 0;
        }
        return ret;
    }

    public String getArea(){
        //TODO---getArea()
        return "";
    }
    public boolean getGender(){
        //TODO ---getGender()
        return true;
    }

    public String getId(){
        return this.id;
    }

}
