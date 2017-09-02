package com.bootcamptech.sentenceservice.service;

import com.bootcamptech.sentenceservice.dao.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SentenceserviceImpl implements Sentenceservice{


    /**
     *
     */


    private AdjectiveDao adjectiveDao;
    private ArticleDao articleDao;
    private NounDao nounDao;
    private SubjectDao subjectDao;
    private VerbDao verbDao;


    @Autowired
    public SentenceserviceImpl(AdjectiveDao adjectiveDao, ArticleDao articleDao, NounDao nounDao, SubjectDao subjectDao, VerbDao verbDao) {
        this.adjectiveDao=adjectiveDao;
        this.articleDao=articleDao;
        this.nounDao=nounDao;
        this.subjectDao=subjectDao;
        this.verbDao=verbDao;
    }

    @Override
    public String buildSentence() {
        String sentrnce = "There is a problem";

        sentrnce = String.format("%s %s %s %s %s",
                subjectDao.getWord().toString(),
                verbDao.getWord().toString(),
                articleDao.getWord().toString(),
                adjectiveDao.getWord().toString(),
                nounDao.getWord().toString());
        return sentrnce;
    }
}
