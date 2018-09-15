package view;

import javax.swing.JOptionPane;
import model.Request;

public class AvgInputView implements InputView {

    @Override
    public void input(Request request) {
        //視覺化對話框
        String eng = JOptionPane.showInputDialog("請輸入 Eng:");
        String math = JOptionPane.showInputDialog("請輸入 Math:");

        //設定成績
        request.setAttribute("eng", eng);
        request.setAttribute("math", math);
    }

}
