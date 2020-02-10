package com.kristyn.goulash;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class homeController {
    @RequestMapping("/")
    public String index() {
        return "navigation";
    }

    @RequestMapping("/goulash")
    public String goulash(){
        return "goulashrecipe";
    }

    @RequestMapping("/yogurt")
    public String yogurt(){
        return "instantpotyogurt";
    }
}

