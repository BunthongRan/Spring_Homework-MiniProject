package com.bunthong.springminiproject.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class Post {
    private int id;
    private String description;
    private String users;
    private User user;
}




