package com.base;

import javax.faces.bean.ManagedBean;

/**
 * Created by et0930 on 6/11/15.
 */
@ManagedBean(name = "helloWorld", eager = true)
public class HelloWorld {
    public HelloWorld() {
        System.out.println("HelloWorld started!");
    }
    public String getMessage() {
        return "Hello World!";
    }
}
