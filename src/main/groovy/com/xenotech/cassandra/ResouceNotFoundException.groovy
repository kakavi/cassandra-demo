package com.xenotech.cassandra
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
class ResouceNotFoundException extends RuntimeException {

    ResouceNotFoundException(String message) {
        super(message);
    }
}