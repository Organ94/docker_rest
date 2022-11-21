package com.example.docker_rest.repository;

import com.example.docker_rest.data.Authorities;
import com.example.docker_rest.user.User;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import static com.example.docker_rest.data.Authorities.*;

@Repository
public class UserRepository {

    Map<String, User> users = new ConcurrentHashMap<>();

    {
        User user1 = new User("login1", "pass1", Arrays.asList(READ, WRITE, DELETE));
        User user2 = new User("login2", "pass2", Arrays.asList(READ, WRITE));
        User user3 = new User("login3", "pass3", List.of(DELETE));

        users.put(user1.getLogin(), user1);
        users.put(user2.getLogin(), user2);
        users.put(user3.getLogin(), user3);
    }

    public List<Authorities> getUserAuthorities(String login, String password) {
        User user = users.get(login);
        return (user != null && user.getPassword().equals(password)) ? user.getAuthorities() : null;
    }
}
