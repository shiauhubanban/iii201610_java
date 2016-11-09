package tw.org.iii.javatest;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;

public class shine42 {
    //TCP Client
    public static void main(String[] args) {
            long start = System.currentTimeMillis();
            try {
                Socket socket = new Socket(
                        InetAddress.getByName("10.2.24.111"), 9999);
                OutputStream out = socket.getOutputStream();
                FileInputStream fin = new FileInputStream(
                        "dir1/android.jpg");
                int b;
                while ( (b = fin.read()) != -1){
                    out.write(b);

                }
                fin.close();
                out.flush();
                out.close();
//  1              socket.getOutputStream();
//  1              BufferedOutputStream bout =
//  1                      new BufferedOutputStream(
//  1                              socket.getOutputStream());
//  1              bout.write("Hello, shine\nHello,World"  .getBytes());
//  1              bout.flush();
//  1              bout.close();
                socket.close();
                System.out.println("ok--------------------");
                System.out.println(System.currentTimeMillis()-start);
            } catch (Exception ee) {
                System.out.println("Client :" + ee.toString());
            }
    }
}
