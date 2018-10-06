package request;

import java.io.BufferedReader;
import java.util.HashMap;
import java.util.Map;

public class RequestImpl implements Request {

    private Map<String, Object> map = new HashMap();
    private BufferedReader reader;

    public RequestImpl(BufferedReader reader) {
        this.reader = reader;
    }

    @Override
    public BufferedReader getReader() {
        return reader;
    }

    @Override
    public void setAttribute(String key, Object value) {
        map.put(key, value);
    }

    @Override
    public Object getAttribute(String key) {
        return map.get(key);
    }

}
