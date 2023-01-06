package ru.RSOI.Gateway.Error;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class EError401Handler {

    @ExceptionHandler(EBadRequestError.class)
    @ResponseStatus(HttpStatus.UNAUTHORIZED)
    public EError401 HandleUnauthorizedError(EUnauthorized error) {
        return new EError401(error.message);
    }

}
