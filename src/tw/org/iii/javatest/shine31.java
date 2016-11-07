package tw.org.iii.javatest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class shine31 {
    public static void main(String[] args){
        try{
            File file = new File("dir1/file1");
            long len = file.length();
            FileInputStream fin =
                    new FileInputStream(file); //開檔
            byte[] buf = new byte[(int)len];
            fin.read(buf);

            System.out.println(new String(buf));
//            byte[] buf = new byte[3]; int len;
//            while ( (len = fin.read(buf) )!= -1){  //不是-1是要的,是的話跳出
//                System.out.print(new String(buf,0,len));
//            }
            fin.close();//關檔
        }catch (FileNotFoundException fe){

        }catch (IOException fe){

        }
    }
}
