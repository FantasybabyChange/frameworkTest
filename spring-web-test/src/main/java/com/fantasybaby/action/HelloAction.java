package com.fantasybaby.action;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author liuxi
 * @date2018年06月12日 14:54
 */
@Controller
public class HelloAction {
    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String hello(){
        return "index";
    }
}
