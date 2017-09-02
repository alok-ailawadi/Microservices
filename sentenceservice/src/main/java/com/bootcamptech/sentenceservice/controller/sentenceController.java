package com.bootcamptech.sentenceservice.controller;


import com.bootcamptech.sentenceservice.service.Sentenceservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class sentenceController {

    @Autowired
    Sentenceservice sentenceService;

    @RequestMapping(path = "/sentence", method = RequestMethod.GET)
    public @ResponseBody String getSentence()
    {

        return "<h3>Some Sentences</h3><br/>" +
                sentenceService.buildSentence() + "<br/><br/>" +
                sentenceService.buildSentence() + "<br/><br/>" +
                sentenceService.buildSentence() + "<br/><br/>" +
                sentenceService.buildSentence() + "<br/><br/>" +
                sentenceService.buildSentence() + "<br/><br/>"
                ;


    }

}
