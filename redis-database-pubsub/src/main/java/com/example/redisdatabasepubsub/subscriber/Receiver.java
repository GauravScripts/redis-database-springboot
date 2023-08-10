package com.example.redisdatabasepubsub.subscriber;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.data.redis.connection.MessageListener;
public class Receiver implements MessageListener {
    Logger logger =  LoggerFactory.getLogger(Receiver.class);
    @Override
    public void onMessage(org.springframework.data.redis.connection.Message message, byte[] bytes) {
        System.out.println("Message received: "+message.toString());
    }
}
