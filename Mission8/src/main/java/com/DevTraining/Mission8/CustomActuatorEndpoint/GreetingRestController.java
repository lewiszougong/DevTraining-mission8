package com.DevTraining.Mission8.CustomActuatorEndpoint;


import com.DevTraining.Mission8.Model.Greeting;
import org.springframework.boot.actuate.endpoint.web.annotation.RestControllerEndpoint;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.concurrent.atomic.AtomicLong;

@Component
@RestControllerEndpoint(id = "rest-controller-endpoint")
public class GreetingRestController {
    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();
    @GetMapping("/hello")
    public ResponseEntity<Greeting> greet(@RequestParam(defaultValue = "Stranger") String name) {
        return new ResponseEntity<Greeting>(new Greeting(counter.incrementAndGet(), String.format(template, name)),
                HttpStatus.OK);
    }
}
