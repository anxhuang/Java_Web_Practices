package view;

import business.BmiCalculator;
import business.MyBmiCalculator;
import model.BmiModel;

public class MyBmiOutputView implements BmiOutputView {

    private BmiCalculator bmiCalculator;

    public void setBmiCalculator(BmiCalculator bmiCalculator) {
        this.bmiCalculator = bmiCalculator;
    }

    @Override
    public void output(BmiModel model) {

        System.out.println("=== Bmi Result ===");
        System.out.println("cm: " + model.getCm());
        System.out.println("kg: " + model.getKg());

        double bmi;
        try {
            bmi = bmiCalculator.calculate(model);
        } catch (NullPointerException e) {
            String msg = "尚未安裝計算器BmiCalculator，請先呼叫setBmiCalculator()";
            throw new BmiOutputViewException(msg);
        }
        System.out.printf("bmi: %.2f\n", bmi);
    }

}
