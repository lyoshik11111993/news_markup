package com.levelup.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;

@Controller
public class MainController {

    @RequestMapping(value = {"/","/home"}, method = RequestMethod.GET)
    public String getMain() {
        return "static/main.html";
    }

    @RequestMapping(value = "/product", method = RequestMethod.GET)
    public String getProduct() {
        return "static/product.html";
    }

}
// #ececec