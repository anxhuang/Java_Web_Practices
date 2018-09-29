package model;

public interface Request {

    void setAttribute(String key, Object value);

    Object getAttribute(String key);
}
