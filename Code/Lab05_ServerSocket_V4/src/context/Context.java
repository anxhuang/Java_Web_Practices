package context;

import java.util.HashMap;
import java.util.Map;

//單例設計模式(Singleton Pattern)
public class Context { //共用櫃台 (寄放大家的資料)

    private Map<String, Object> map = new HashMap();
    private static Context context = new Context();
    //私有建構子
    private Context() {
    }
    // getter 回傳唯一物件
    public static Context getContext() {
        return context;
    }

    public void setAttribute(String key, Object value) {
        map.put(key, value); //放資料
    }

    public Object getAttribute(String key) {
        return map.get(key); //取資料
    }
}
