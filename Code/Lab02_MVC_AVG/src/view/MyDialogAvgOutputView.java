package view;

import business.AvgCalculator;
import javax.swing.JOptionPane;
import model.AvgModel;

public class MyDialogAvgOutputView implements AvgOutputView {

    @Override
    public void output(AvgModel model, AvgCalculator calculator) {

        calculator.calculate(model);

        StringBuilder sb = new StringBuilder();

        sb.append("Eng:  ")
                .append(model.getEng())
                .append("\n")
                .append("Math:  ")
                .append(model.getMath())
                .append("\n")
                .append("Total:  ")
                .append(calculator.getTotal())
                .append("\n")
                .append("Avg:  ")
                .append(calculator.getAvg());

        //視覺化對話框
        JOptionPane.showMessageDialog(null, sb);
    }

}
