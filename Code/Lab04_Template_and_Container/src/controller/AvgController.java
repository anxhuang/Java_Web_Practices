package controller;

import javax.swing.JOptionPane;
import model.Request;

public class AvgController extends Controller {

    @Override
    protected void input(Request request) {
        //視覺化對話框
        String eng = JOptionPane.showInputDialog("請輸入 Eng:");
        String math = JOptionPane.showInputDialog("請輸入 Math:");

        //設定成績
        request.setAttribute("eng", eng);
        request.setAttribute("math", math);
    }

    @Override
    protected void calculate(Request request) {
        String eng = (String) request.getAttribute("eng");
        String math = (String) request.getAttribute("math");

        int total = Integer.parseInt(eng) + Integer.parseInt(math);
        double avg = total / 2.0;

        request.setAttribute("total", total);
        request.setAttribute("avg", avg);
    }

    @Override
    protected void output(Request request) {

        String msg
                = "Eng:  " + request.getAttribute("eng") + "\n"
                + "Math:  " + request.getAttribute("math") + "\n"
                + "Total:  " + request.getAttribute("total") + "\n"
                + "Avg:  " + request.getAttribute("avg");

        //視覺化對話框
        JOptionPane.showMessageDialog(null, msg);
    }
}
