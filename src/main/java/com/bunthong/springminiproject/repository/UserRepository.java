package com.bunthong.springminiproject.repository;


import com.bunthong.springminiproject.model.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
@Repository
public class UserRepository {
    List<User> users = new ArrayList<>(){{
        add(new User(111, "Raksmey", "https://cdn1.iconfinder.com/data/icons/avatars-150/256/Manager.png",  "A Cambodia Developer", "female", "Raksmey@gmail.com", "Kompong Chhnang", "https://cdn.pixabay.com/photo/2016/07/11/15/43/woman-1509956__480.jpg"));
        add(new User(222, "Chhaya", "https://cdn1.iconfinder.com/data/icons/facely-metapeople-3d-avatar-set/256/15._Astronaut.png" ,"A Cambodia Fullstack Developer ", "male", "chhaya@gmail.com", "Cambodia", "https://media.istockphoto.com/id/1397336702/photo/young-east-asian-business-man-leaning-forward-in-his-chair-leaning-on-his-elbow-on-his-leg.jpg?b=1&s=170667a&w=0&k=20&c=ghVoyIMmVjKxn3Lc1ZVKQIFb2sBBV83-4MiB7Wcaekk="));
        add(new User(333, "Keo","https://cdn3.iconfinder.com/data/icons/freelancy-3d/256/20._Face.png" ,  "A handsome guy who was born at Siem Reap, he have a crush on his classmate for a long time but he shy to confess. ", "male", "keosr@gmail.com", "Siem Reap", "https://cdn.pixabay.com/photo/2015/01/08/18/29/entrepreneur-593358__480.jpg"));


    }};
    public List<User> getAllAuthor(){
        return users;
    }

}

