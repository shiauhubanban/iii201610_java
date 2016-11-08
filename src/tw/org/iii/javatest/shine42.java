package tw.org.iii.javatest;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;

public class shine42 {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            try {
                Socket socket = new Socket(
                        InetAddress.getByName("127.0.0.1"), i);
                socket.close();
                System.out.println(i);
            } catch (Exception ee) {

            }
        }
    }
}
