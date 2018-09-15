package controller;

import business.AvgCalculator;
import model.AvgModel;
import view.AvgInputView;
import view.AvgOutputView;

public class MyAvgController implements AvgController {

    private AvgModel model;
    private AvgInputView inputView;
    private AvgOutputView outputView;
    private AvgCalculator calculator;

    public void setModel(AvgModel model) {
        this.model = model;
    }

    public void setInputView(AvgInputView inputView) {
        this.inputView = inputView;
    }

    public void setOutputView(AvgOutputView outputView) {
        this.outputView = outputView;
    }

    public void setCalculator(AvgCalculator calculator) {
        this.calculator = calculator;
    }

    @Override
    public void process() {
        inputView.input(model);
        outputView.output(model, calculator);
    }

}
