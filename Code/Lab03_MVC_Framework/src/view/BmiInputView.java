package view;

import java.util.Scanner;
import javax.swing.JOptionPane;
import model.Request;

public class BmiInputView implements InputView {

    @Override
    public void input(Request request) {
        
        String cm = JOptionPane.showInputDialog("請輸入 cm");
        String kg = JOptionPane.showInputDialog("請輸入 kg");

        request.setAttribute("cm", cm);
        request.setAttribute("kg", kg);
    }

}
