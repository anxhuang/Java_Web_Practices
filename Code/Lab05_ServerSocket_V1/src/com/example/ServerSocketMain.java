package com.example;

import java.util.Scanner;

public class ServerSocketMain {

    public static void main(String[] args) {

        final int PORT = 10000;

        //建立Server工作
        ServerRunnable r = new ServerRunnable(PORT);

        //將Server工作交付給 新執行緒
        Thread t = new Thread(r);

        //新執行緒 開工
        t.start();

        //等待按下Enter (不讓程式結束 使Server保持傾聽)
        waitEnterKey();

        //※通知Server工作可以結束了
        r.stop();

    }

    private static void waitEnterKey() {
        Scanner sc = new Scanner(System.in);
        sc.nextLine(); //等待Enter
    }
}
