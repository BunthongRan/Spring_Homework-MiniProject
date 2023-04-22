package com.bunthong.springminiproject.controller;

import com.bunthong.springminiproject.repository.PostRepository;
import com.bunthong.springminiproject.service.PostService;
import org.springframework.stereotype.Controller;

@Controller
public class PostController {
    PostService postService;

    public PostController(PostService postService) {
        this.postService = postService;
    }
}
