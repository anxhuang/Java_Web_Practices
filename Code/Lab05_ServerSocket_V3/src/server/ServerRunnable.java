package server;

import controller.CmKgController;
import controller.GenericController;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.Charset;
import request.RequestImpl;
import response.ResponseImpl;

public class ServerRunnable implements Runnable {

    private int PORT;
    private int count;

    public ServerRunnable(int PORT) {
        this.PORT = PORT;
    }

    @Override
    public void run() {
        try (
                ServerSocket ss = new ServerSocket(PORT);
                Socket socket = ss.accept();
                BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream(), Charset.defaultCharset()));
                PrintWriter pw = new PrintWriter(socket.getOutputStream(), true);) {

            pw.println("Hello, 我是Server, 有什麼需要服務的? (例如Bmi)"); //送出訊息

            //客戶端送入的訊息
            String clientMsg;

            while ((clientMsg = br.readLine()) != null) {
                if ("Bmi".equals(clientMsg)) {
                    //建立CmKgController
                    GenericController gc = new CmKgController();
                    //建立Request和Response 工作轉交給CmKgController處理
                    gc.service(new RequestImpl(br), new ResponseImpl(pw));
                } else if ("Bye".equals(clientMsg)) {
                    pw.println("Bye");
                    break;
                } else {
                    pw.println("聽不懂你說什麼...");
                }
            }
        } catch (IOException e) {
            System.err.println(e);
        }
    }

}
