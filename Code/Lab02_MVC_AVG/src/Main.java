
import business.AvgCalculator;
import business.MyAvgCalculator;
import controller.MyAvgController;
import model.AvgModel;
import model.MyAvgModel;
import view.AvgInputView;
import view.AvgOutputView;
import view.MyAvgInputView;
import view.MyAvgOutputView;
import view.MyDialogAvgInputView;
import view.MyDialogAvgOutputView;

public class Main {

    public static void main(String[] args) {
        //宣告參數與建立物件
        AvgModel model = new MyAvgModel();
        AvgInputView inputView = new MyDialogAvgInputView(); //可以和MyAvgInputView任意互換
        AvgOutputView outputView = new MyDialogAvgOutputView(); //可以和MyAvgOutputView任意互換
        AvgCalculator calculator = new MyAvgCalculator();
        MyAvgController controller = new MyAvgController();

        //組裝物件
        controller.setModel(model);
        controller.setInputView(inputView);
        controller.setOutputView(outputView);
        controller.setCalculator(calculator);
        
        //執行流程
        controller.process();
    }
}
