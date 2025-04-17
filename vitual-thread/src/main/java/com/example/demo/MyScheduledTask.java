package com.example.demo;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class MyScheduledTask {
    @Scheduled(fixedRate = 2000)
    public void run() {
        System.out.println(">>> 작업 실행 중: " + LocalDateTime.now());
    }
}
