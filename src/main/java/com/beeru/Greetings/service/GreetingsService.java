package com.beeru.Greetings.service;

import java.time.LocalTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GreetingsService implements Igreeting {

    @Autowired
    private LocalTime time;

    public GreetingsService() {
        System.out.println("GreetingsService bean created");
    }

    @Override
    public String generateGreetings(String name) {
        int hour = time.getHour();

        if (hour < 12) {
            return "Good morning " + name;
        } else if (hour < 16) {
            return "Good afternoon " + name;
        } else if (hour < 20) {
            return "Good evening " + name;
        } else {
            return "Good night " + name;
        }
    }
}