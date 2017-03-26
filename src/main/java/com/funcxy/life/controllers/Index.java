package com.funcxy.life.controllers;

import com.funcxy.life.contents.IndexResponse;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

/**
 * IndexResponse Controller
 */
@RestController
@RequestMapping("/")
public class Index {
    @RequestMapping(method = GET)
    public IndexResponse main() {
        return new IndexResponse();
    }
}
