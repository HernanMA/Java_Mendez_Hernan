/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.solid;

/**
 *
 * @author hernan
 */
public class ConsoleNotificationLogger implements NotificationLogger {
    @Override
    public void logNotification(String message) {
        System.out.println("Log: " + message);
    }
}

