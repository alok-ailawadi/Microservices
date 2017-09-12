package com.bootcamptech.sentenceservice.exception;


import com.bootcamptech.exception.BootcamptechError;
import com.bootcamptech.exception.BootcamptechExecptionResult;
import com.bootcamptech.exception.JsonDeserializer;
import com.google.gson.Gson;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.HttpClientErrorException;

import java.io.IOException;
import java.util.List;

@ControllerAdvice
@RestController
public class GlobalExceptionHandler {


    @ExceptionHandler(value = HttpClientErrorException.class)
    public ResponseEntity<BootcamptechExecptionResult> handleClientErrorException(HttpClientErrorException e) throws IOException, ClassNotFoundException {

        System.out.println(e.getResponseBodyAsString());
        BootcamptechExecptionResult result = new BootcamptechExecptionResult();
        result = JsonDeserializer.getErrorObject(e.getResponseBodyAsString());
        ResponseEntity<BootcamptechExecptionResult> response;
        response = new ResponseEntity<BootcamptechExecptionResult>(result, e.getStatusCode());
        return response;
    }


}
