package business;

import model.AvgModel;

public interface AvgCalculator {

    void calculate(AvgModel model);

    int getTotal();

    double getAvg();
}
