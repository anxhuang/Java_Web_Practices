package view;

import java.util.Scanner;
import model.AvgModel;

public class MyAvgInputView implements AvgInputView {

    @Override
    public void input(AvgModel model) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Eng:");
        int eng = sc.nextInt();
        System.out.print("Math:");
        int math = sc.nextInt();

        model.setEng(eng);
        model.setMath(math);
    }

}
