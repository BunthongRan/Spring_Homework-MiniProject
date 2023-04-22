package com.bunthong.springminiproject.service.serviceImpl;

import com.bunthong.springminiproject.model.Post;
import com.bunthong.springminiproject.repository.PostRepository;
import com.bunthong.springminiproject.service.PostService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostServiceImpl implements PostService {
    PostRepository articleRepository;

    PostServiceImpl() {articleRepository = new PostRepository();}

    @Override
    public List<Post> getAllPost() {
        return null;
    }

    @Override
    public Post getPostById(int id) {
        return null;
    }

    @Override
    public List<Post> getPostByName(String name) {
        return null;
    }
}