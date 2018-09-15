package view;

import javax.swing.JOptionPane;
import model.Request;

public class BmiOutputView implements OutputView {

    @Override
    public void output(Request request) {

        String msg
                = "cm: " + request.getAttribute("cm") + "\n"
                + "kg: " + request.getAttribute("kg") + "\n"
                + "bmi: " + request.getAttribute("bmi");

        JOptionPane.showMessageDialog(null, msg);
    }

}
