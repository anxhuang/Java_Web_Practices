package controller;

//abstract class 無法建立物件
import model.MyRequest;
import model.Request;

abstract public class Controller {

    //template method (樣板方法)
    final public void process() { //final method 不能被複寫

        //建立 請求物件 (櫃台)
        Request request = new MyRequest();

        //virtual method (虛擬方法)
        this.input(request); //※這裡的this是指將來子類別建立的物件
        this.calculate(request);
        this.output(request);
    }

    protected void input(Request request) {
        //給子類別去實作
    }

    protected void calculate(Request request) {
        //給子類別去實作
    }

    protected void output(Request request) {
        //給子類別去實作
    }
}
