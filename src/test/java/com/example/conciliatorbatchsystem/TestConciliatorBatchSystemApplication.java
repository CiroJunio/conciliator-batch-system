package com.example.conciliatorbatchsystem;

import org.springframework.boot.SpringApplication;

public class TestConciliatorBatchSystemApplication {

    public static void main(String[] args) {
        SpringApplication.from(ConciliatorBatchSystemApplication::main).with(TestcontainersConfiguration.class).run(args);
    }

}
