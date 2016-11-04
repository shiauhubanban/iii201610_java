package tw.org.iii.javatest;
public class shine24substring {
  public static void main(String[] args){
      String id ="A223456789";
      String s1 = (id.substring(4));
      System.out.println(s1);
      String s2 = (id.substring(4,7));
      System.out.println(s2);
      System.out.println("----------");
      if(id.matches("^[A-Z][12][0-9]{8}$")){
          System.out.println("ok");
      }else{
          System.out.println("XX");
      }

  }
}
