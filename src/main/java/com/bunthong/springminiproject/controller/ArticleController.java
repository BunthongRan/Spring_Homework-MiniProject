package com.bunthong.springminiproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class ArticleController {
    @GetMapping("/index")
    public String getAllArticle(){
        return "all-article";
    }
}
