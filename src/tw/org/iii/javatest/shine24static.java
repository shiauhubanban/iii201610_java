package tw.org.iii.javatest;
public class shine24static {
    public static void main(String[] args){

    }
}
class Person{
    String name;
    static private int counter;
    Person(String name){
        this.name = name;
        counter++;
    }
    void sayYa(){
        System.out.println(name + ":Ya");
    }
    static int getCounter(){  //static 屬於該類別的屬性 不專屬於任何物件
        return counter;
    }
}