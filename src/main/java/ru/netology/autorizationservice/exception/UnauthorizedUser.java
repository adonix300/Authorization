package ru.netology.autorizationservice.exception;

import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus

public class UnauthorizedUser extends RuntimeException {
    public UnauthorizedUser(String msg) {
        super(msg);
    }
}