package view;

import javax.swing.JOptionPane;
import model.Request;

public class AvgOutputView implements OutputView {

    @Override
    public void output(Request request) {

        String msg
                = "Eng:  " + request.getAttribute("eng") + "\n"
                + "Math:  " + request.getAttribute("math") + "\n"
                + "Total:  " + request.getAttribute("total") + "\n"
                + "Avg:  " + request.getAttribute("avg");

        //視覺化對話框
        JOptionPane.showMessageDialog(null, msg);
    }

}
