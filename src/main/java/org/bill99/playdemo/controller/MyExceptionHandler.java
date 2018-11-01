package org.bill99.playdemo.controller;

import org.bill99.playdemo.exception.MyException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.ModelAndView;

@RestControllerAdvice
public class MyExceptionHandler {

    @ExceptionHandler(value = MyException.class)
    public ModelAndView myExceptionHandler(Exception e){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.getModel().put("message",e.getMessage());
        modelAndView.setViewName("error");
        return modelAndView;
    }
}
