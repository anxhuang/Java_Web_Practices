package business;

import model.Request;

public class AvgCalculator implements Calculator {

    @Override
    public void calculate(Request request) {
        String eng = (String) request.getAttribute("eng");
        String math = (String) request.getAttribute("math");

        int total = Integer.parseInt(eng) + Integer.parseInt(math);
        double avg = total / 2.0;

        request.setAttribute("total", total);
        request.setAttribute("avg", avg);
    }
}
