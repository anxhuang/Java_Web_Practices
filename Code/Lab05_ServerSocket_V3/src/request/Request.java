package request;

import java.io.BufferedReader;

public interface Request {

    BufferedReader getReader();

    void setAttribute(String key, Object value);

    Object getAttribute(String key);
}
