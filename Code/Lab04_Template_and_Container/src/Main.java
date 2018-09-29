
import container.Container;
import controller.AvgController;
import controller.BmiController;
import controller.Controller;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
        String type;
        Container c = new Container(); //建立容器

//        while (true) {
//            type = JOptionPane.showInputDialog("請輸入 Bmi 或 Avg");
//            if (type == null) {
//                break; //按下 取消 type會得到null
//            }
//            c.service(type);
//        }
        //由文字檔設定執行那個服務 用try() {} 讀檔並自動關閉釋放資源
        try {
            FileReader fr = new FileReader("service.txt");
            BufferedReader br = new BufferedReader(fr);
            type = br.readLine();
            c.service(type);
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
