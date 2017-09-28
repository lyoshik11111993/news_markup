package com.levelup.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MainController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String getMain() {
        return "static/main.html";
    }

    @RequestMapping(value = "/product", method = RequestMethod.GET)
    public String getProduct() {
        return "static/product.html";
    }

}
