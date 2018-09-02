package com.sonpen.user;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * Created by sonikju on 2018-09-02.
 */
@ControllerAdvice
public class ExceptionHandleController {

    @ExceptionHandler(UserException.class)
    public ResponseEntity<String> handleException(UserException e) {
        return new ResponseEntity<String>(HttpStatus.I_AM_A_TEAPOT);
    }
}
