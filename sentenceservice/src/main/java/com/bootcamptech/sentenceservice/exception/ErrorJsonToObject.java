package com.bootcamptech.sentenceservice.exception;

public class ErrorJsonToObject {

    private BootcamptechErrors[] errors;

    public BootcamptechErrors[] getErrors() {
        return errors;
    }

    public void setErrors(BootcamptechErrors[] errors) {
        this.errors = errors;
    }
}
