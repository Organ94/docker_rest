package com.example.docker_rest.exception;

public class UnauthorizedUser extends RuntimeException {

    public UnauthorizedUser(String msg) {
        super(msg);
    }
}
