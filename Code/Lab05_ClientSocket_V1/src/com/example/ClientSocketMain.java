package com.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;
import java.net.UnknownHostException;
import java.nio.charset.Charset;

public class ClientSocketMain {

    public static void main(String[] args) {
        final int PORT = 10000; //分機號碼
        Socket socket = null;   //通訊負責人
        InputStream is = null;
        InputStreamReader isr = null;
        BufferedReader br = null;
        String serverMessage = null;

        try {
            try {
                socket = new Socket("localhost", PORT); //連線(撥號) localhost代表本機
                is = socket.getInputStream(); //位元組(數字) 資料流
                isr = new InputStreamReader(is, Charset.defaultCharset()); //文字資料流
                br = new BufferedReader(isr);
                serverMessage = br.readLine(); //讀取一行字串(對方送來的訊息)
                System.out.println(serverMessage); //顯示讀到的字串訊息
            } finally {
                if (br != null) {
                    br.close();
                }
                if (socket != null) {
                    socket.close();
                }
            }
        } catch (UnknownHostException e) { //未知的連線位址
            System.out.println(e);
        } catch (IOException e) {
            System.out.println(e);
        }

    }
}
