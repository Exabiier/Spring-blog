package codeup.codeupspringblog.controllers;

import codeup.codeupspringblog.Model.BlogPost;
import codeup.codeupspringblog.Repository.BlogPostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class BlogPostController {
    private final BlogPostRepository blogPostRepository;

    public BlogPostController(BlogPostRepository blogPostRepository) {
        this.blogPostRepository = blogPostRepository;
    }

    @GetMapping("/blogposts")
    public List<BlogPost> getAllPost(){
        return blogPostRepository.findAll();
    }


}
