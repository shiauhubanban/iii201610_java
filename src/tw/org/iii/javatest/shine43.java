package tw.org.iii.javatest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class shine43 {
    //TCP Server
    public static void main(String[] args){
        try {
            ServerSocket server = new ServerSocket(9999);
            System.out.println("Listening");
            Socket socket = server.accept();
            //取得IP位置
            String urip = socket.getInetAddress().getHostAddress();
            System.out.println(urip + ";" );

            socket.getInputStream();

            BufferedReader br =
                    new BufferedReader(
                            new InputStreamReader(
                                    socket.getInputStream()));
            String line;
            while ((line= br.readLine()) != null){
                System.out.println(line);
            }
            br.close();

            server.close();
            System.out.println("server OK");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
