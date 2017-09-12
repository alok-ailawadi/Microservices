package com.bootcamptech.sentenceservice.exception;

import com.bootcamptech.exception.BootcamptechError;
import com.google.common.collect.Lists;

import java.util.List;

public class BootcamptechErrors {

    private BootcamptechError error;

    public BootcamptechError getError() {
        return error;
    }

    public void setErrors(BootcamptechError error) {
        this.error = error;
    }
}
