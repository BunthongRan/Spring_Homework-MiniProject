package com.bunthong.springminiproject.service.serviceImpl;

import com.bunthong.springminiproject.model.User;
import com.bunthong.springminiproject.repository.UserRepository;
import com.bunthong.springminiproject.service.UserService;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    UserRepository userRepository;

    UserServiceImpl(){ userRepository =  new UserRepository();}


    @Override
    public User getUserById(int id) {
        return null;
    }

    @Override
    public List<User> getAllUsers() {
        return null;
    }

    @Override
    public void addUser(User user) {

    }

    @Override
    public void updateUser(User user) {

    }

    @Override
    public void deleteUser(int id) {

    }
}