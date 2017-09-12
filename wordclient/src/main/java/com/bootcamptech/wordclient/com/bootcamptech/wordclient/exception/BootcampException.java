package com.bootcamptech.wordclient.com.bootcamptech.wordclient.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class BootcampException extends Exception {
}
