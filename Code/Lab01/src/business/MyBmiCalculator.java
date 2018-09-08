package business;

import model.BmiModel;

public class MyBmiCalculator implements BmiCalculator {

    @Override
    public double calculate(BmiModel model) {
        double m = model.getCm() / 100.0;
        double bmi = model.getKg() / m / m;
        return bmi;
    }

}
