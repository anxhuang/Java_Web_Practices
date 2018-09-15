package business;

import model.Request;

public class BmiCalculator implements Calculator {

    @Override
    public void calculate(Request request) {
        String cm = (String) request.getAttribute("cm");
        String kg = (String) request.getAttribute("kg");

        double m = Double.parseDouble(cm) / 100.0;
        double bmi = Double.parseDouble(kg) / m / m;

        request.setAttribute("bmi", bmi);
    }

}
