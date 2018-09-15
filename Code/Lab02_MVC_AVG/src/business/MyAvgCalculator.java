package business;

import model.AvgModel;

public class MyAvgCalculator implements AvgCalculator {

    private AvgModel model;

    @Override
    public void calculate(AvgModel model) {
        this.model = model;
    }

    @Override
    public int getTotal() {
        return model.getEng() + model.getMath();
    }

    @Override
    public double getAvg() {
        return (model.getEng() + model.getMath()) / 2.0;
    }

}
