package com.sonpen.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.http.HttpMessageConverters;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by sonikju on 2018-08-19.
 */
@RestController
public class UserController {

    @Autowired
    HttpMessageConverters converters;

    @RequestMapping("/")
    public String index() {
        converters.getConverters().forEach(c -> System.out.println("::::::::::::" + c.getClass()));
        return "Hello Spring MVC";
    }
}
