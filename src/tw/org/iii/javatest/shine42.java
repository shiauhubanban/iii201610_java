package tw.org.iii.javatest;

import java.io.BufferedOutputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;

public class shine42 {
    //TCP Client
    public static void main(String[] args) {
            try {
                Socket socket = new Socket(
                        InetAddress.getByName("10.2.24.111"), 9999);

                socket.getOutputStream();
                BufferedOutputStream bout =
                        new BufferedOutputStream(
                                socket.getOutputStream());
                bout.write("Hello, shine\nHello,World"  .getBytes());
                bout.flush();
                bout.close();

                socket.close();
                System.out.println("ok");
            } catch (Exception ee) {

            }
    }
}
