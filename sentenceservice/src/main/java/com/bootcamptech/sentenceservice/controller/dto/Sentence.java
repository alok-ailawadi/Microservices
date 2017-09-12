package com.bootcamptech.sentenceservice.controller.dto;

public class Sentence {

    public Sentence(String s) {
        sentence = s;
    }

    public String getSentence() {
        return sentence;
    }

    public void setSentence(String sentence) {
        this.sentence = sentence;
    }

    public String sentence;
    
    
    
}
