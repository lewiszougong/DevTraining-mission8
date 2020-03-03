package com.DevTraining.Mission8;

import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/home")
@Component
@Log4j2
@RefreshScope
public class HelloWorld {

    @Value("${print}")
    private String printHello;

    @GetMapping
    public String hello(@RequestParam("id") Integer userId){
        log.debug("Debug UserId: "+userId);
        log.warn("Warn UserId: " +userId);
        return "Hello World : "+printHello;
    }
}