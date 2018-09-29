package container;

import controller.AvgController;
import controller.BmiController;
import controller.Controller;
import java.util.HashMap;
import java.util.Map;

public class Container {

    //用Map管理Controller (Cache 快取物件，方便將來重複使用，節省記憶體)
    private Map<String, Controller> map = new HashMap<>();

    public void service(String type) {
//        switch (type) {
//            case "Bmi":
//                if (!map.containsKey(type)) { //如果map當中沒有"Bmi"這個key
//                    map.put(type, new BmiController()); //type為key ， BmiController為value 放入map
//                }
//                break;
//            case "Avg":
//                if (!map.containsKey(type)) { //如果map當中沒有"Avg"這個key
//                    map.put(type, new AvgController());//type為key ， AvgController為value 放入map
//                }
//                break;
//            default:
//                break;
//        }

        //利用 反射機制 載入物件 (解除耦合，程式中看不出建立何種物件)
        String classname = "controller." + type + "Controller";
        try {
            Controller c;
            if (!map.containsKey(type)) {
                //Java 反射機制 字串 變 物件
                Class cla = Class.forName(classname); //Class是魔法
                c = (Controller) cla.newInstance(); //產生物件
                map.put(type, c);
            } else {
                c = map.get(type); //取得已建立的Controller物件
            }
            c.process(); //執行流程
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
            System.out.println(e);
        }

    }
}
