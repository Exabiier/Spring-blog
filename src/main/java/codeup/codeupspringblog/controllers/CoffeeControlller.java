package codeup.codeupspringblog.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/coffee")
public class CoffeeControlller {

    @GetMapping
    public String coffee(){
        return "coffee";
    }
    @GetMapping("/{roast}")
    public String roast(@PathVariable String roast, Model model){
        model.addAttribute("roast", roast);
        return "coffee";
    }

    @PostMapping
    public String signUp(@RequestParam(name="email") String email, Model model ){
        model.addAttribute("email", email);
        return coffee();
    }
}
