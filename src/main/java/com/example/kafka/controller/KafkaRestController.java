package com.example.kafka.controller;

import com.example.kafka.message.repository.MessageRepository;
import com.example.kafka.sender.MessageProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KafkaRestController {

    @Autowired
    private MessageProducer producer;

    @Autowired
    private MessageRepository messageRepo;

    //Send message to kafka
    @GetMapping("/send")
    public String sendMsg(
            @RequestParam("msg") String message) {
        producer.sendMessage(message);
        return "'" + message + "' sent successfully!";
    }

    //Read all messages
    @GetMapping("/getAll")
    public String getAllMessages() {
        return messageRepo.getAllMessages() ;
    }
}