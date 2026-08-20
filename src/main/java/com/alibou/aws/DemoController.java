package com.alibou.aws;

import java.util.concurrent.atomic.AtomicInteger;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/demo")
public class DemoController {

    private final AtomicInteger counter = new AtomicInteger();

    @GetMapping
    public String demo() {
        int responseNumber = counter.incrementAndGet();
        return String.format(
                "<h1>Response from demo controller</h1><p>Response number: %d</p>",
                responseNumber);
    }
}
