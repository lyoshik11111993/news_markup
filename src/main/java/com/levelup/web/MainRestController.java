package com.levelup.web;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainRestController {

    @RequestMapping(value = "/product", method = RequestMethod.POST)
    public String getProductPost() {
        return "dfgdfdfgdfgdfgd";
    }
}
