public interface NotificationService {
/**
 * Envía notificación al destinatario
 * 
 * @param message     El contenido del mensaje que se va a enviar
 * @param recipient   El destinatario (email, teléfono, token push, etc.)
 */

    void sendNotification(String message, String recipiente);
}

