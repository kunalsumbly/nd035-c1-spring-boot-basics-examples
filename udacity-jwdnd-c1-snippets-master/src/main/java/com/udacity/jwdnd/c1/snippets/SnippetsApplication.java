package com.udacity.jwdnd.c1.snippets;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;

@SpringBootApplication
@Controller
public class SnippetsApplication {

    public static void main(String[] args) {
        SpringApplication.run(SnippetsApplication.class, args);
    }

}
