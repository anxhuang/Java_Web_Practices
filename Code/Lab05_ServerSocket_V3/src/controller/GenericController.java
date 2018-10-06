package controller;

import request.Request;
import response.Response;

//基本款Controller
abstract public class GenericController {

    public abstract void service(Request request, Response response);
}
