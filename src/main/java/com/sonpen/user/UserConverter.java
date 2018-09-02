package com.sonpen.user;

import org.springframework.core.convert.converter.Converter;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;

/**
 * Created by sonikju on 2018-09-01.
 */
@Component
public class UserConverter implements Converter<String, User> {

    @Nullable
    @Override
    public User convert(String id) {
        User user = new User();
        user.setId(Integer.parseInt(id));
        user.setName("converter");
        return user;
    }
}
