package view;

import javax.swing.JOptionPane;
import model.AvgModel;

public class MyDialogAvgInputView implements AvgInputView {

    @Override
    public void input(AvgModel model) {
        //視覺化對話框
        String e = JOptionPane.showInputDialog("Eng:");
        String m = JOptionPane.showInputDialog("Math:");

        //字串轉整數
        int eng = Integer.parseInt(e);
        int math = Integer.parseInt(m);

        //設定成績
        model.setEng(eng);
        model.setMath(math);
    }

}
