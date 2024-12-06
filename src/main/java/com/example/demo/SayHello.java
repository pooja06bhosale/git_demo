package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SayHello {


        @RequestMapping("/helloooo")
        public String SayHello() {
            return "Helloooo";

        }
    }
