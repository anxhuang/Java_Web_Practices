
import controller.Controller;
import factory.Factory;
import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
        String type;
        Controller c;

        while (true) {
            type = JOptionPane.showInputDialog("請輸入 Bmi 或 Avg");
            if (type == null) {
                break; //按下 取消 type會得到null
            }
            c = Factory.newController(type); //static方法不用new 透過Class呼叫
            if (c != null) {
                c.Process();
            }
        }
    }
}
