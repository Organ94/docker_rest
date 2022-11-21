package com.example.docker_rest.user;

import com.example.docker_rest.data.Authorities;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class User {

    private String login;
    private String password;
    private List<Authorities> authorities;
}
