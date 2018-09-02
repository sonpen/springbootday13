package com.sonpen.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.http.HttpMessageConverters;
import org.springframework.hateoas.Link;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;

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

    @GetMapping("/user")
    public User currentUser() {
        User user = new User();
        user.setAge(20);
        user.setHeight(175);
        user.setName("sonpen");

        return user;
    }

    @GetMapping("/user/{id}")
    public UserResource getUser(@PathVariable("id") User user)  {
        if( user.getId() == 100) {
            throw new UserException();
        }

        UserResource resource = new UserResource();
        resource.setTitle(user.getId() + " 번째 사용자 입니다");

        Link link = linkTo(UserController.class).slash("user").slash(user.getId()).withSelfRel();
        resource.add(link);

        return resource;
    }

}
