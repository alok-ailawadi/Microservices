package com.bootcamptech.sentenceservice.dto;

public class Word {

    public Word(String word) {
        this.word = word;
    }

    public Word() {
        super();
    }

    private String word;

    @Override
    public String toString() {
        return getWord();
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }
}
