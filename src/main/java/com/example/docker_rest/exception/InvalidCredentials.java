package com.example.docker_rest.exception;

public class InvalidCredentials extends RuntimeException {

    public InvalidCredentials(String msg) {
        super(msg);
    }
}
