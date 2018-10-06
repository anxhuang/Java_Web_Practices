package controller;

import request.Request;
import response.Response;

public class BmiController extends GenericController {

    @Override
    public void service(Request request, Response response) {
        //取出資料
        String cmStr = (String) request.getAttribute("cm");
        String kgStr = (String) request.getAttribute("kg");
        //字串轉數字
        float cm = Float.parseFloat(cmStr);
        float kg = Float.parseFloat(kgStr);
        //計算Bmi
        float m = cm / 100F;
        float bmi = kg / (m * m);
        //輸出結果到客戶端
        response.getWriter().println("BMI = " + bmi);
    }

}
