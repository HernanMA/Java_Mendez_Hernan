/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.solid;

/**
 *
 * @author hernan
 */
public class SMSNotificationSender implements NotificationSender {
    private NotificationConfig config;
    private NotificationLogger logger;

    public SMSNotificationSender(NotificationConfig config, NotificationLogger logger) {
        this.config = config;
        this.logger = logger;
    }

    @Override
    public void send(String message) {
        // Aquí usarías `config.getSmsApiKey()` para configurar la API
        System.out.println("Enviando SMS usando API: " + config.getSmsApiKey());
        System.out.println("Mensaje: " + message);
        logger.logNotification("SMS enviado: " + message);
    }
}

