package tw.org.iii.javatest;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class shine33 {
    public static void main(String[] args){
        try {
            FileOutputStream fout =
                    new FileOutputStream("dir1/file3", true);
            fout.write("Hello, shine\n".getBytes());
            fout.flush();
            fout.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
