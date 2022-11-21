package codeup.codeupspringblog.controllers;

import codeup.codeupspringblog.Model.Post;
import codeup.codeupspringblog.Model.Post1;
import codeup.codeupspringblog.Repository.PostRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/posts")

public class PostController {

    private final PostRepository postDoa;

    public PostController(PostRepository postDoa) {
        this.postDoa = postDoa;
    }



    @GetMapping

//    These are all the post from a user
    public String allUserPosts(Model model){
//    the Doa.findAll() method will always retrun a data structure of List<>
        List<Post1> posts = postDoa.findAll();
        model.addAttribute("allPosts", posts);
        return "/posts/index";
    }

    @GetMapping("/{id}")

//    Single post from a user. See it as the user is expanding the comment that is shown in YouTube.
    public String singlePost(@PathVariable long id, Model model){

        List<Post1> posts = postDoa.findAll();

//      We have an empty post so then we can put single post in it.
        Post1 post = null;
        for (Post1 userPost : posts){

//          We can use the getId() to get the key o=on the table
            if (userPost.getId() == id){
                post = userPost;
            }
        }
        model.addAttribute("post", post);

//      This returns the
        return "/posts/show";
    }

    @GetMapping("/create")

    public String posts2(String id){
        return "/posts/create-post";
    }


//  The url of the post map must match the form action path:
//
    @PostMapping("/create")
//    We need to use the name attribute to get the value from the inputs
    public String addCoffee(@RequestParam(name="title") String title, @RequestParam(name="message") String message){
        Post1 coffee = new Post1(title, message);
        postDoa.save(coffee);
        return "/posts/create-post";

    }

//    @GetMapping("/create-posts")




}
