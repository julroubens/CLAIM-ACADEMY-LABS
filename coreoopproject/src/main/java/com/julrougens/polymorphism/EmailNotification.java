package com.julrougens.polymorphism;

import com.julrougens.inheritance.interfaces.Notification;

public class EmailNotification implements Notification {

    @Override
    public void send() {
        System.out.println("Email Notification");
    }
}
