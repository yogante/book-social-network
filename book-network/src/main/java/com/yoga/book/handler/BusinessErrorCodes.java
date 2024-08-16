package com.yoga.book.handler;

import lombok.Getter;
import org.springframework.http.HttpStatus;

import static org.springframework.http.HttpStatus.BAD_REQUEST;
import static org.springframework.http.HttpStatus.NOT_IMPLEMENTED;

public enum BusinessErrorCodes {

    NO_CODE(0, "no code", NOT_IMPLEMENTED),
    INCORRECT_CURRENT_PASSWORD(300, "Current password is not correct", BAD_REQUEST),
    NEW_PASSWORD_DOES_NOT_MATCH(301, "resent password does not match", BAD_REQUEST),
    ACCOUNT_LOCKED(302, "User Account is locked.", HttpStatus.FORBIDDEN),
    ACCOUNT_DISABLED(303, "User Account is disabled.", HttpStatus.FORBIDDEN),
    BAD_CREDENTIALS(304, "Login and/or password  is incorrect.", HttpStatus.FORBIDDEN),
    ;
    @Getter
    private final int code;
    @Getter
    private final String description;
    @Getter
    private final HttpStatus httpStatus;

    BusinessErrorCodes(int code, String description, HttpStatus httpStatus) {
        this.code = code;
        this.description = description;
        this.httpStatus = httpStatus;
    }
}
