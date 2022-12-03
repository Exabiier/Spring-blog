package codeup.codeupspringblog.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloResource {

    @RequestMapping("/Hello")
    @ResponseBody
    public String hello(){
        return "Hello World";
    }
}
