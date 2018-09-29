package com.example;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.nio.charset.Charset;

public class ServerRunnable implements Runnable {

    //volatile讓其他執行緒能立即看到exit被修改了
    private volatile boolean exit = false;

    private ServerSocket ss = null;
    private Socket socket = null;
    private final int PORT;

    public ServerRunnable(int PORT) {
        this.PORT = PORT;
    }

    //此方法由 Main Thread(主執行緒) 呼叫
    public void stop() {
        exit = true;
    }

    //此方法由 新執行緒 呼叫
    @Override
    public void run() {
        System.out.println("總機小姐 上班了......");
        OutputStream os = null;         //位元組(數字)      輸出資料流
        OutputStreamWriter osw = null;  //文字(字串)        輸出資料流
        BufferedWriter bw = null;       //文字緩衝區(陣列)  輸出資料流

        while (!exit) {
            try {
                ss = new ServerSocket(PORT); //設定分機號碼
                ss.setSoTimeout(500); //0.5秒 逾時
                socket = ss.accept(); //可以接聽電話，接到電話 產生 socket(話筒)
                os = socket.getOutputStream(); //取得 輸出 數字(整數) 資料流

                //Charset.defaultCharset()取得系統預設編碼(例如預設為UTF-8, 使用"UTF-8"亦同)
                osw = new OutputStreamWriter(os, Charset.defaultCharset());
                bw = new BufferedWriter(osw); //提供資料緩衝區(陣列)
                bw.write("Hello, 我是Server"); //將資料送到緩衝區
                bw.flush(); //將資料送出

            } catch (SocketTimeoutException e) {
                System.err.println("逾時...");
            } catch (IOException e) {
                System.out.println(e);
            } finally {
                try {
                    if (bw != null) {
                        bw.close();
                    }
                    if (ss != null) {
                        ss.close();
                    }
                } catch (IOException e) {
                    System.out.println(e);
                }
            }
        }
        System.out.println("總機小姐 下班了......");
    }

}
