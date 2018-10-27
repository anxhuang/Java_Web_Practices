
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

public class Client {

    public static void main(String[] args) {
        URL url = null;
        InputStream is = null;
        BufferedReader br = null;
        String s = null;

        try {
            try {
                url = new URL("http://localhost:8084/Lab09_Header/HeaderServlet");
                is = url.openStream();
                br = new BufferedReader(new InputStreamReader(is));
                while ((s = br.readLine()) != null) {
                    System.out.println(s);
                }
            } finally {
                if (br != null) {
                    br.close();
                }
            }
        } catch (IOException e) {
            System.err.println(e);
        }
    }
}
