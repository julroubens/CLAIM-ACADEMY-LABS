package com.julrougens.polymorphism;

import com.julrougens.inheritance.interfaces.Notification;

public class SMSNotification implements Notification {
    @Override
    public void send() {
        System.out.println("SMS Notification");
    }
}
