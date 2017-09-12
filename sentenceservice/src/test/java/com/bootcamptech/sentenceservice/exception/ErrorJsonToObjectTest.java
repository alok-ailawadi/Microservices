package com.bootcamptech.sentenceservice.exception;

import com.bootcamptech.exception.BootcamptechError;
import com.google.gson.Gson;
import org.junit.Test;

import javax.validation.constraints.AssertFalse;
import java.util.Arrays;
import java.util.List;

public class ErrorJsonToObjectTest {

    private static String json = "{\"bootcamptechErrors\":[{\"errorCode\":1401,\"errorMessage\":\"user limit exceeded, please transact less than : \",\"bootcamptechError\":null,\"bootcamptechErrorCode\":0,\"bootcamptechErrorCategory\":\"error\",\"additionalParams\":{}}]}";
    @Test
    public void deserializeTest()
    {
        Gson  g = new Gson();
        ErrorJsonToObject error = g.fromJson(json, ErrorJsonToObject.class);
        System.out.println(error.toString());
        // List<BootcamptechError> errors = Arrays.asList(error.getBootcamptechErrors());
    }
}
