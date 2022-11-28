package codeup.codeupspringblog.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

    @GetMapping("/hello")
    @ResponseBody
    public String Hello(){
        return "Hello World";
    }

    @GetMapping("/hello/{name}")
    @ResponseBody
    public String sayHello(@PathVariable String name){
        return "Hello " + name + "!";
    }




}
