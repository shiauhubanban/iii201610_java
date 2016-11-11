package tw.org.iii.javatest;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class shine47 {
    public static void main(String[] args) {
        try {
            //URL url = new URL("http://127.0.0.1/shine02.php?x=123&y=789"); //GET
            URL url = new URL("http://127.0.0.1/shine02.php"); //POST
            HttpURLConnection conn =
                    (HttpURLConnection)url.openConnection();
            conn.connect();

            BufferedReader br = new BufferedReader(
                    new InputStreamReader(conn.getInputStream()));
            String line = br.readLine();
            br.close();

            System.out.println(line);
            System.out.println("finish");
        } catch (Exception e) {

        }
    }
}
