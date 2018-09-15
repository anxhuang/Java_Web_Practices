
import business.BmiCalculator;
import business.MyBmiCalculator;
import controller.MyBmiController;
import model.BmiModel;
import model.MyBmiModel;
import view.BmiInputView;
import view.MyBmiInputView;
import view.MyBmiOutputView;

public class Main {

    public static void main(String[] args) {
        //宣告變數
        BmiModel model;
        BmiInputView inputView;
        BmiCalculator calculator;
        MyBmiOutputView outputView;
        MyBmiController controller;

        //1. 建立資料物件(Model)
        model = new MyBmiModel();
        //2. 建立顯示輸入資料介面(View)
        inputView = new MyBmiInputView();
        //3. 建立計算或商業邏輯(Business)
        calculator = new MyBmiCalculator();
        //4. 建立顯示輸出結果介面(View)
        outputView = new MyBmiOutputView();
        //5. 建立控制器(Controller)
        controller = new MyBmiController();

        //設定output要執行的計算或商業邏輯
        outputView.setBmiCalculator(calculator);

        //組裝零組件
        controller.setModel(model);
        controller.setInputView(inputView);
        controller.setOutputView(outputView);
        controller.process();
    }
}
