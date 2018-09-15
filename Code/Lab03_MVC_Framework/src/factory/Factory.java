package factory;

import business.AvgCalculator;
import business.BmiCalculator;
import controller.Controller;
import model.MyRequest;
import view.AvgInputView;
import view.AvgOutputView;
import view.BmiInputView;
import view.BmiOutputView;

public class Factory {

    public static Controller newController(String type) {
        Controller c = null;
        switch (type) {
            case "Bmi":
                c = new Controller();
                c.setRequest(new MyRequest());
                c.setInputView(new BmiInputView());
                c.setCalculator(new BmiCalculator());
                c.setOutputView(new BmiOutputView());
                break;
            case "Avg":
                c = new Controller();
                c.setRequest(new MyRequest());
                c.setInputView(new AvgInputView());
                c.setCalculator(new AvgCalculator());
                c.setOutputView(new AvgOutputView());
                break;
            default:
                break;
        }
        return c;
    }
}
