package tw.org.iii.javatest;

import java.io.File;
import java.io.IOException;

public class shine48 {
    public static void main(String[] args){
        try {
            MultipartUtility mu =
                    new MultipartUtility("http://10.2.24.111/shine02.php","utf-8");
            mu.addFilePart("upload",new File("upload/android.jpg"));
            mu.finish();
            System.out.println("upload OK");
        } catch (IOException e) {
            System.out.println(e.toString());
        }
    }
}

