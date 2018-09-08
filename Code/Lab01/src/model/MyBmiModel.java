package model;

import model.BmiModel;

public class MyBmiModel implements BmiModel {

    private double cm;
    private double kg;

    @Override
    public double getCm() {
        return cm;
    }

    @Override
    public double getKg() {
        return kg;
    }

    @Override
    public void setCm(double cm) {
        this.cm = cm;
    }

    @Override
    public void setKg(double kg) {
        this.kg = kg;
    }

}
