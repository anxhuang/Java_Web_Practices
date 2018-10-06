package com.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.Charset;

public class ServerRunnable implements Runnable {

    private final int PORT;
    private int count;

    public ServerRunnable(int PORT) {
        this.PORT = PORT;
    }

    @Override
    public void run() { //由新執行緒呼叫
        try (
                ServerSocket ss = new ServerSocket(PORT);
                Socket socket = ss.accept();
                BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream(), Charset.defaultCharset()));
                PrintWriter pw = new PrintWriter(socket.getOutputStream(), true);) {

            pw.println("Hello, 我是Server, 有什麼需要服務的? (例如Bmi)"); //送出訊息

            //客戶端送來的訊息
            String clientMsg;

            while ((clientMsg = br.readLine()) != null) {
                if ("Bmi".equals(clientMsg)) {
                    pw.println("請輸入身高(cm):"); //送出訊息
                } else if ("Bye".equals(clientMsg)) {
                    pw.println("Bye"); //送出訊息
                    break; //跳出迴圈
                } else {
                    pw.println("聽不懂你說什麼..."); //送出訊息
                }
            }
        } catch (IOException e) {
            System.err.println(e);
        }
    }
}
