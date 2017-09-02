package com.bootcamptech.sentenceservice.dao;

import com.bootcamptech.sentenceservice.dto.Word;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient("VERB")
public interface VerbDao {

    @RequestMapping(path = "/getWord", method = RequestMethod.GET)
    public Word getWord();
}
