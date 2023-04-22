package com.bunthong.springminiproject.repository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CategoryRepository {
    List<ListCategory> categories = new ArrayList<>(){{
        add(new ListCategory("Education"));
        add(new ListCategory("Entertain"));
        add(new ListCategory("Sport"));
        add(new ListCategory("Digital Marketing"));
        add(new ListCategory("English"));
    }};

    public List<ListCategory> getAllCategory(){
        return categories;
    }
}

