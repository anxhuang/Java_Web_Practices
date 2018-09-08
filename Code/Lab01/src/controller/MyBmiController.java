package controller;

import model.BmiModel;
import view.BmiInputView;
import view.BmiOutputView;

public class MyBmiController implements BmiController {

    private BmiModel model;
    private BmiInputView inputView;
    private BmiOutputView outputView;

    public void setModel(BmiModel model) {
        this.model = model;
    }

    public void setInputView(BmiInputView inputView) {
        this.inputView = inputView;
    }

    public void setOutputView(BmiOutputView outputView) {
        this.outputView = outputView;
    }

    @Override
    public void process() {
        //設定要輸入的資料物件
        inputView.input(model);
        //設定要輸出的資料物件  
        outputView.output(model);
    }

}
