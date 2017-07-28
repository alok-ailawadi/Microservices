package com.bootcamptech;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

/**
 * Created by Alok on 7/28/2017.
 */
@org.springframework.stereotype.Controller
public class Controller {

    @RequestMapping("/hello/{name}")
    public String hello(@PathVariable String name, Model model)
    {
        model.addAttribute("name", name);
        return "helloWorld";
    }
}
