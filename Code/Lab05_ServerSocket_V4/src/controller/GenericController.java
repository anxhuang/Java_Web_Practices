package controller;

import context.Context;
import java.io.IOException;
import request.Request;
import response.Response;

//基本款Controller
abstract public class GenericController {

    public abstract void service(Request request, Response response) throws IOException;
    public Context getContext(){
        return Context.getContext(); //取得唯一共用櫃台
    }
}
