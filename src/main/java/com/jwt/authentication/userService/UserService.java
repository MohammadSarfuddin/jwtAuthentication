package com.jwt.authentication.userService;

import com.jwt.authentication.model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class UserService {

    List<User> list = new ArrayList<>();

    public UserService() {
        list.add(new User(UUID.randomUUID().toString(), "Mohammad", "mohammad@gmail.com"));
        list.add(new User(UUID.randomUUID().toString(), "Sarfuddin", "sarfuddin@dev.in"));
        list.add(new User(UUID.randomUUID().toString(), "Alfaz", "Alfaz@dev.in"));
        list.add(new User(UUID.randomUUID().toString(), "Rohit", "rohit@dev.in.com"));
        list.add(new User(UUID.randomUUID().toString(), "Ahmad", "Ahmad@dev.in"));
    }

    public List<User> getList(){
        return this.list;
    }
}
