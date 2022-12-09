package com.example.reacts.main;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

    @GetMapping("/api/hello")
    public @ResponseBody String main(){

        return "Hello, world";
    }
}
