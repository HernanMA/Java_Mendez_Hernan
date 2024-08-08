/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.solid;

/**
 *
 * @author hernan
 */
public class SOLID {

    public static void main(String[] args) {
        // Configuración
        NotificationConfig config = new NotificationConfig("smtp.example.com", "API_KEY_SMS");

        // Logger
        NotificationLogger logger = new ConsoleNotificationLogger();

        // Creación de servicios
        NotificationSender emailSender = new EmailNotificationSender(config, logger);
        NotificationSender smsSender = new SMSNotificationSender(config, logger);

        NotificationService emailService = new NotificationService(emailSender);
        NotificationService smsService = new NotificationService(smsSender);

        // Crear usuario
        User user = new User("Juan Pérez", "juan.perez@example.com", "+123456789");

        // Enviar notificaciones
        emailService.sendNotification(user, "¡Hola, Juan! Tu cuenta ha sido creada.");
        smsService.sendNotification(user, "Hola Juan, tu código de verificación es 123456.");
    }
}
