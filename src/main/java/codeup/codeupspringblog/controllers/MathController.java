package codeup.codeupspringblog.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

public class MathController {

    @GetMapping("/add/3/and/4")
    @ResponseBody
    public String add(){
        int ans = 3 +4;
        return String.valueOf(ans);
    }

    @GetMapping("/subtract/3/from/10")
    @ResponseBody
    public String sub(){
        int ans = 10 - 3;
        return String.valueOf(ans);
    }

    @GetMapping("/multiply/4/and/5")
    @ResponseBody
    public String multiply(){
        int ans = 4*5;
        return String.valueOf(ans);
    }

    @GetMapping("/divide/6/and/3")
    @ResponseBody
    public String divide(){
        int ans = 6/2;
        return String.valueOf(ans);
    }

}
