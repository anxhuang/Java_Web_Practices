package view;

import business.AvgCalculator;
import model.AvgModel;

public interface AvgOutputView {

    void output(AvgModel model, AvgCalculator calculator);
}
