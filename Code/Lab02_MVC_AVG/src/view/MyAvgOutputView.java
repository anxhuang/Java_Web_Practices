package view;

import business.AvgCalculator;
import model.AvgModel;

public class MyAvgOutputView implements AvgOutputView {

    @Override
    public void output(AvgModel model, AvgCalculator calculator) {

        calculator.calculate(model);

        StringBuilder sb = new StringBuilder();

        sb.append("Eng:\t")
                .append(model.getEng())
                .append("\n")
                .append("Math:\t")
                .append(model.getMath())
                .append("\n")
                .append("Total:\t")
                .append(calculator.getTotal())
                .append("\n")
                .append("Avg:\t")
                .append(calculator.getAvg());

        System.out.println("-----------------");
        System.out.println(sb);
    }

}
