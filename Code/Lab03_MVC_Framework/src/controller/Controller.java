package controller;

import business.Calculator;
import model.Request;
import view.InputView;
import view.OutputView;

public class Controller {

    private InputView inputView;
    private Calculator calculator;
    private OutputView outputView;
    private Request request;
    
    public void setInputView(InputView inputView) {
        this.inputView = inputView;
    }
    
    public void setCalculator(Calculator calculator) {
        this.calculator = calculator;
    }
    
    public void setOutputView(OutputView outputView) {
        this.outputView = outputView;
    }
    
    public void setRequest(Request request) {
        this.request = request;
    }
    
    public void Process() {
        inputView.input(request);
        calculator.calculate(request);
        outputView.output(request);
    }
}
