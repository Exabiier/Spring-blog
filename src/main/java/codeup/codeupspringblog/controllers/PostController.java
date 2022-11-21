package codeup.codeupspringblog.controllers;

import codeup.codeupspringblog.Model.Post;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/posts")

public class PostController {



    @GetMapping

//    These are all the post from a user
    public String allUserPosts(Model model){
        Post post1 = new Post(1, "First", "This is the first post");
        Post post2 = new Post(2, "Second", "Lets go!");
        List<Post> allThePosts = new ArrayList<>(List.of(post1, post2));
        model.addAttribute("allPosts", allThePosts);
        return "/posts/index";
    }

    @GetMapping("/{id}")


//    Single post from a user. See it as the user is expanding the comment that is shown in YouTube.
    public String singlePost(@PathVariable long id, Model model){
        Post post1 = new Post(1, "First", "This is my first post");
        Post post2 = new Post(2, "Second", "Lets go!");
        Post post3 = new Post(3, "Third", "Hey you not Me");
        List<Post> singlePosts = new ArrayList<>(List.of(post1, post2, post3));

//      We have an empty post so then we can put single post in it.
        Post post = null;
        for (Post userPost : singlePosts){
            if (userPost.getId() == id){
                post = userPost;
            }
        }
        model.addAttribute("post", post);

//      This returns the
        return "/posts/show";
    }

//    @GetMapping("/posts/create")
//    @ResponseBody
//    public String posts2(String id){
//        return this.id;
//    }


    @PostMapping("/posts/create")
    @ResponseBody
    public String posts3(String id){
        return "create a new post";
    }



}
