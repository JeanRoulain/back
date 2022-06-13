package com.restservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.awt.*;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicLong;

import static com.restservice.Greeting.Boucle;

@RestController
public class GreetingController {
    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    public Greeting test = new Greeting();

    @GetMapping("/greeting")
    public Greeting greeting(@RequestParam(value = "name") String name) {
        //test.setId()= counter.incrementAndGet();
        return new Greeting(counter.incrementAndGet(), String.format(template, name));
    }

    /*@GetMapping("/greeting")
    public Greeting greeting(@RequestParam(value = "name") String name) {
        test.setContent(String.format(template, name));
        return test;
    }*/

    @GetMapping("/boucle")
    public ArrayList<String> boucle(@RequestParam(value = "name") String name) {
        return Boucle(new Greeting(counter.incrementAndGet(), String.format(template, name)));
    }
}
