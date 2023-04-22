package com.bunthong.springminiproject.service;

import com.bunthong.springminiproject.model.Post;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public interface PostService {
    List<Post> getAllPost();

    Post getPostById(int id);
    List<Post> getPostByName(String name);
}


