/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.solid;

/**
 *
 * @author hernan
 */
public class EmailNotificationSender implements NotificationSender {
    private NotificationConfig config;
    private NotificationLogger logger;

    public EmailNotificationSender(NotificationConfig config, NotificationLogger logger) {
        this.config = config;
        this.logger = logger;
    }

    @Override
    public void send(String message) {
        // Aquí usarías `config.getEmailServer()` para configurar el servidor
        System.out.println("Enviando email usando servidor: " + config.getEmailServer());
        System.out.println("Mensaje: " + message);
        logger.logNotification("Email enviado: " + message);
    }
}

