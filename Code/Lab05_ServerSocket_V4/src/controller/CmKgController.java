package controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.concurrent.atomic.AtomicInteger;
import request.Request;
import response.Response;

//負責輸入資料的網頁
public class CmKgController extends GenericController {

    @Override
    public void service(Request request, Response response) throws IOException { //宣告拋出例外由Container捕捉
      
        BufferedReader in = request.getReader();
        PrintWriter out = response.getWriter();

        out.println("請輸入身高(cm):"); //輸出訊息給client
        String cmStr = in.readLine(); //讀取client輸入的cm

        out.println("請輸入體重(kg):"); //輸出訊息給client
        String kgStr = in.readLine(); //讀取client輸入的kg

        out.write("計算中..."); //輸出訊息但還不要送出

        //寄放 cm kg 資料
//            request.setAttribute("cm", cmStr);
//            request.setAttribute("kg", kgStr);
        getContext().setAttribute("cm", cmStr);
        getContext().setAttribute("kg", kgStr);

        //轉交給BmiController
        GenericController gc = new BmiController();
        gc.service(request, response);

    }

}
