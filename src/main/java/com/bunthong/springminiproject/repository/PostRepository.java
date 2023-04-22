package com.bunthong.springminiproject.repository;

import com.bunthong.springminiproject.model.Post;
import com.bunthong.springminiproject.model.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@Repository
public class PostRepository {
    List<Post> posts = new ArrayList<>(){{
        add(new Post(111,"BUSINESS" , "Bunthong", new UserRepository().getAllAuthor().get(0)));
        add(new Post(222,"DATA ANALYTICS", "Naro", new UserRepository().getAllAuthor().get(1)));
        add(new Post(333,"CYBER SECURITY","Leng", new UserRepository().getAllAuthor().get(2)));
    }};

    private Map<Object, Object> getAllUser() {
        return null;
    }

    public List<Post> getArticles(){
        return posts;
    }

    public Post getPostById(int id){
        return posts.stream().filter(e -> e.getId() == id).findFirst().orElse(null);
    }

    public List<Post> getPostsByName(String user){
        return getArticles().stream().filter(number->Objects.equals(number.getUsers(), user)).toList();
    }
}