package com.example.docker_rest.controller;

import com.example.docker_rest.data.Authorities;
import com.example.docker_rest.service.AuthorizationService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class AuthorizationController {

    AuthorizationService service;

    @GetMapping("/authorize")
    public List<Authorities> getAuthorities(
            @RequestParam("user") String user,
            @RequestParam("password") String password) {
        return service.getAuthorities(user, password);
    }
}
