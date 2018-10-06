package controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import request.Request;
import response.Response;

public class CmKgController extends GenericController {

    @Override
    public void service(Request request, Response response) {
        BufferedReader in = request.getReader();
        PrintWriter out = response.getWriter();

        try {
            out.println("請輸入身高(cm):"); //輸出訊息給client
            String cmStr = in.readLine(); //讀取client輸入的cm

            out.println("請輸入體重(kg):"); //輸出訊息給client
            String kgStr = in.readLine(); //讀取client輸入的kg

            out.write("計算中..."); //輸出訊息但還不要送出

            //寄放 cm kg 資料
            request.setAttribute("cm", cmStr);
            request.setAttribute("kg", kgStr);

            //轉交給BmiController
            GenericController gc = new BmiController();
            gc.service(request, response);

        } catch (IOException e) {
            //輸出訊息給客戶端
            out.println("抱歉 Server 出現I/O問題");
        }
    }

}
