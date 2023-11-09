package com.springproj.codebuffer1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @GetMapping("/")
    public  String display() {
        return "My Spring display";
    }
}
