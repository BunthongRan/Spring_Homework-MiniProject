package com.bunthong.springminiproject.controller;

import com.bunthong.springminiproject.model.Post;
import com.bunthong.springminiproject.model.request.ArticleRequest;
import com.bunthong.springminiproject.repository.CategoryRepository;
import com.bunthong.springminiproject.repository.PostRepository;
import com.bunthong.springminiproject.service.PostService;
import com.bunthong.springminiproject.service.serviceImpl.PostServiceImpl;
import com.bunthong.springminiproject.service.serviceImpl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@Controller
public class HomeController {
    CategoryRepository categoryRepository;
    PostServiceImpl postService;

    UserServiceImpl userService;

    @Autowired
    public HomeController(CategoryRepository categoryRepository, PostServiceImpl postService, UserServiceImpl userService) {
        this.categoryRepository = categoryRepository;
        this.postService = postService;
        this.userService = userService;
    }

    @GetMapping("/home")
    String index(){
        return "index";
    }

    @GetMapping("/profile")
    String profile(){
        return "profile";
    }

    @GetMapping("/allusers")
    public String allUsers(Model model){
        model.addAttribute("User", userService.getAllUsers());
        model.addAttribute("allPost", postService.getAllPost());
        return "alluser";



    }

}
