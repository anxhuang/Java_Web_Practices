
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.nio.charset.Charset;
import java.util.Scanner;

public class ClientSocketMain {

    public static void main(String[] args) {
        final int PORT = 10000; //分機號碼
        try (
                Socket socket = new Socket("Localhost", PORT); //連線
                //取得Server送入的資料
                BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream(), Charset.defaultCharset()));
                //準備要送給Server的資料Writer, autoFlush=true 直接送出資料 不需呼叫flush()
                PrintWriter pw = new PrintWriter(socket.getOutputStream(), true);) {

            //Server送入的訊息
            String serverMsg;

            //鍵盤 使用者輸入用
            Scanner sc = new Scanner(System.in);
            String input;

            while ((serverMsg = br.readLine()) != null) { //若Server持續有訊息送入則繼續
                System.out.println("Server說: " + serverMsg);
                if ("Bye".equals(serverMsg)) { //若Server說Bye則跳出迴圈
                    break;
                }

                //使用者輸入訊息
                System.out.print("> ");
                input = sc.nextLine();

                //送出訊息
                pw.println(input);
            }
        } catch (UnknownHostException e) { //未知的連線位址
            System.err.println(e);
        } catch (IOException e) {
            System.err.println(e);
        }
    }
}
