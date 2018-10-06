package container;

import controller.CmKgController;
import controller.GenericController;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import request.RequestImpl;
import response.ResponseImpl;

//單例設計模式(Singleton Pattern)
public class Container {

    private static Container instance;
    //私有建構子
    private Container() {
    }
    //回傳唯一物件 (synchronized 執行緒安全)
    public static synchronized Container getInstance() {
        //確保只產生一個Container
        if (instance == null) {
            instance = new Container();
        }
        return instance;
    }
    
    private CmKgController cmKgController;

    public void processService(BufferedReader in, PrintWriter out) {

        out.println("Hello, 我是Server, 有什麼需要服務的? (例如Bmi)"); //送出訊息

        //客戶端送入的訊息
        String clientMsg;
        
        try {
            while ((clientMsg = in.readLine()) != null) {
                if ("Bmi".equals(clientMsg)) {
                    //確保只產生一個CmKgController
                    if (cmKgController == null){
                        cmKgController = new CmKgController();
                    }
                    //建立執行服務所需Request和Response 工作轉交給CmKgController處理
                    cmKgController.service(new RequestImpl(in), new ResponseImpl(out));
                } else if ("Bye".equals(clientMsg)) {
                    out.println("Bye");
                    break;
                } else {
                    out.println("聽不懂你說什麼...");
                }
            }
        } catch (IOException e) {
            out.println("Server發生I/O問題");
            out.println("Bye");
        }
    }
}
