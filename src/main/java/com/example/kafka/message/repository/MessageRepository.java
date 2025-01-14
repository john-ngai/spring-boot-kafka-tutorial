package com.example.kafka.message.repository;

import org.springframework.stereotype.Component;
import java.util.List;
import java.util.ArrayList;

@Component
public class MessageRepository {

    private final List<String> list = new ArrayList<>();

    public void addMessage(String message) {
        list.add(message);
    }

    public String getAllMessages() {
        return list.toString();
    }
}