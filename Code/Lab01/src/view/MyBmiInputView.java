package view;

import java.util.Scanner;
import model.BmiModel;

public class MyBmiInputView implements BmiInputView {

    @Override
    public void input(BmiModel model) {
        Scanner sc = new Scanner(System.in);
        System.out.print("cm:");
        double cm = sc.nextDouble();
        System.out.print("kg:");
        double kg = sc.nextDouble();

        model.setCm(cm);
        model.setKg(kg);
    }

}
