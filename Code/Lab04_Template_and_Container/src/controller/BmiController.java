package controller;

import javax.swing.JOptionPane;
import model.Request;

public class BmiController extends Controller {

    @Override
    protected void input(Request request) {
        String cm = JOptionPane.showInputDialog("請輸入 cm");
        String kg = JOptionPane.showInputDialog("請輸入 kg");

        request.setAttribute("cm", cm);
        request.setAttribute("kg", kg);
    }

    @Override
    protected void calculate(Request request) {
        String cm = (String) request.getAttribute("cm");
        String kg = (String) request.getAttribute("kg");

        double m = Double.parseDouble(cm) / 100.0;
        double bmi = Double.parseDouble(kg) / m / m;

        request.setAttribute("bmi", bmi);
    }

    @Override
    protected void output(Request request) {

        String msg
                = "cm: " + request.getAttribute("cm") + "\n"
                + "kg: " + request.getAttribute("kg") + "\n"
                + "bmi: " + request.getAttribute("bmi");

        JOptionPane.showMessageDialog(null, msg);
    }

}
