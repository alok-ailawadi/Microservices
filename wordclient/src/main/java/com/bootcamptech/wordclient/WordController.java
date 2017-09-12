package com.bootcamptech.wordclient;

import com.bootcamptech.wordclient.com.bootcamptech.wordclient.exception.BootcampException;
import com.bootcamptech.wordclient.dto.Word;
import org.springframework.beans.factory.access.BootstrapException;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class WordController {

    @Value("${words}") String words;

    @RequestMapping(path = "/getWord", method = RequestMethod.GET)
    public @ResponseBody
    Word getWord() throws Exception{
        String[] wordArray = words.split(",");
        int i = (int)Math.round(Math.random() * (wordArray.length - 1));
        if (i%3 == 0)
                throw new BootcampException();
        return new Word(wordArray[i]);
    }

}