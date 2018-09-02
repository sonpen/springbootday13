package com.sonpen.user;

import org.springframework.hateoas.ResourceSupport;

/**
 * Created by sonikju on 2018-09-02.
 */
public class UserResource extends ResourceSupport {
    private String title;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
