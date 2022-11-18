package codeup.codeupspringblog.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/posts")

public class PostController {



    @GetMapping("/posts")

//    These are all the posts
    public String allUserPosts(Model model){


        return "/posts/index";
    }

    @GetMapping("/posts/{id}")
    @ResponseBody
    public String posts1(@PathVariable String id, Model model){
        model.addAttribute("post",id );
        return "/posts/show";
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
