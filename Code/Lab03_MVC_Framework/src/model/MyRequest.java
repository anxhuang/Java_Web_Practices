package model;

import java.util.HashMap;
import java.util.Map;

public class MyRequest implements Request {

    //HAS-A (Composition 組合)
    private Map<String, Object> map = new HashMap();

    @Override
    public void setAttribute(String key, Object value) {
        map.put(key, value); //放資料
    }

    @Override
    public Object getAttribute(String key) {
        return map.get(key); //取資料
    }

}
