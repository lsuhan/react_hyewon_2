package com.example.reacts.main;

import com.example.reacts.board.Board;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.sql.Timestamp;
import java.util.Date;

@Controller
public class HomeController {

    @GetMapping("/api/hello")
    public @ResponseBody String main(){

        return "Hello, world";
    }
}
