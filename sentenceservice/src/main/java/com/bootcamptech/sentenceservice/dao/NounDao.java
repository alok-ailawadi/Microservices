package com.bootcamptech.sentenceservice.dao;

import com.bootcamptech.sentenceservice.dto.Word;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient("NOUN")
public interface NounDao {

    @RequestMapping(value = "/getWord", method = RequestMethod.GET)
    public Word getWord();

}
