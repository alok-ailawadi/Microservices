package com.bootcamptech.wordclient.com.bootcamptech.wordclient.exception;

import com.bootcamptech.exception.BootcamptechError;
import com.bootcamptech.exception.BootcamptechExecptionResult;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

@ControllerAdvice
@RestController
public class GlobalExceptionHandler {


    @ExceptionHandler(value = BootcampException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ResponseEntity<BootcamptechExecptionResult> handleException(BootcampException e)
    {
        BootcamptechExecptionResult result = new BootcamptechExecptionResult();
        BootcamptechError error = new BootcamptechError();
        error.setErrorCode(1401); //have an enumeration of error codes for this microservice
        error.setErrorMessage("user limit exceeded, please transact less than : ");
        error.setBootcamptechErrorCategory("RULE");
        Map<String,Object> additionalParams= new HashMap<String,Object>();
        additionalParams.put("MaxLimit", "20");
        additionalParams.put("MinLimit", "5");

        error.setAdditionalParams(additionalParams);
        result.addBootcamptechError(error);
        Random rand = new Random();
        int no = rand.nextInt(3-1) + 1;

        ResponseEntity<BootcamptechExecptionResult> response = new ResponseEntity<BootcamptechExecptionResult>(result, HttpStatus.BAD_GATEWAY);

        switch (no)
        {
            case 1:
                 response = new ResponseEntity<BootcamptechExecptionResult>(result, HttpStatus.PRECONDITION_FAILED);
                break;
            case 2:
                 response = new ResponseEntity<BootcamptechExecptionResult>(result, HttpStatus.NOT_FOUND);
                break;
            case 3:
                 response = new ResponseEntity<BootcamptechExecptionResult>(result, HttpStatus.CONFLICT);

        }


        return response;
    }

}
