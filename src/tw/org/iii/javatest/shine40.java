package tw.org.iii.javatest;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class shine40 {
    //UDP - Receiver  非連接導向
    public static void main(String[] args){
        byte[] buf = new byte[1024];
        try {
            DatagramSocket socket =
                    new DatagramSocket(8888);
            DatagramPacket packet =
                    new DatagramPacket(buf, buf.length);
            socket.receive(packet);
            socket.close();
            String urip = packet.getAddress().getHostAddress();
            int len = packet.getLength();
            byte[] mesg = packet.getData();

            System.out.println(urip + ";" + new String(mesg,0,len));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
