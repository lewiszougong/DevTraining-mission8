package com.DevTraining.Mission8.CustomActuatorEndpoint;


import com.DevTraining.Mission8.Model.Greeting;
import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.boot.actuate.endpoint.annotation.WriteOperation;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.concurrent.atomic.AtomicLong;

@Component
@Endpoint(id="hello-endpoint")
public class GreetingCustomEndpoint {
    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();
    @ReadOperation
    public Greeting sayHello(@RequestParam(defaultValue = "Stranger") String name) {
        return new Greeting(counter.incrementAndGet(), String.format(template, name));
    }

    @WriteOperation
    public Greeting saveHello(@RequestParam(defaultValue = "Stranger") String name) {
        return new Greeting(counter.incrementAndGet(), String.format(template, name));
    }
}
