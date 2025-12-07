package com.ynshb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TaskManager implements CommandLineRunner {

    @Autowired
    YounessService younessService;

    public static void main(String[] args) {
        SpringApplication.run(TaskManager.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        younessService.printUser();
    }
}