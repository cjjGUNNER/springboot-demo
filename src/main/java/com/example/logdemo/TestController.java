package com.example.logdemo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class TestController {

    @RequestMapping("log")
    public String testLog(){
        log.info("#########  info  #########");
        log.debug("#########  debug  #########");
        log.error("#########  error  #########");
        return null;
    }
}
