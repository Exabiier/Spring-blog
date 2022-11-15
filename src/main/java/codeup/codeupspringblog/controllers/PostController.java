package codeup.codeupspringblog.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PostController {

    private String id = "view the form for creating a post";

    @GetMapping("/posts")
    @ResponseBody
    public String posts(){
        return "posts index page";
    }

    @GetMapping("/posts/{id}")
    @ResponseBody
    public String posts1(@PathVariable String id){
        return id;
    }

    @GetMapping("/posts/create")
    @ResponseBody
    public String posts2(String id){
        return this.id;
    }

    @PostMapping("/posts/create")
    @ResponseBody
    public String posts3(String id){
        return "create a new post";
    }

}
