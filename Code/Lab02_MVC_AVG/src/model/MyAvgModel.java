package model;

public class MyAvgModel implements AvgModel {

    private int eng;
    private int math;

    @Override
    public void setEng(int eng) {
        this.eng = eng;
    }

    @Override
    public void setMath(int math) {
        this.math = math;
    }

    @Override
    public int getEng() {
        return eng;
    }

    @Override
    public int getMath() {
        return math;
    }

}
