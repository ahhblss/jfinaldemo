package com.demo.controller;

import com.jfinal.core.Controller;

/**
 * Created by Sean.liu on 2017/1/18.
 */
public class HelloController extends Controller {
    public void index(){
        renderText("hello world!");
    }
}
