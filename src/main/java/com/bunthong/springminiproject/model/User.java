package com.bunthong.springminiproject.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor


public class User {
    private int id;
    private String name;
    private String profile;
    private String Description;
    private String gender;
    private String email;
    private String address;
    private String img =  "https://developers.elementor.com/docs/assets/img/elementor-placeholder-image.png";
}
