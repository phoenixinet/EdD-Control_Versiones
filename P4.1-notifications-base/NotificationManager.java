public class NotificationManager {

    private NotificationService strategy;
    private final int MAX_RETRIES = 3;

    public void setStrategy(NotificationService strategy) {
        this.strategy = strategy;
    }

    public void send(String message, String recipient)
    {
        if (strategy == null)
            throw new IllegalStateException("\n[!] Estrategia no definida!.");

        int attempts = 0;

        while (attempts < MAX_RETRIES)
        {
            attempts++;
            try 
            {
                strategy.sendNotification(message, recipient);
                return;
            } catch (Exception e) 
            {
                System.out.println("\n[i] Fallo al enviar la notificación. Intento: " + attempts + ". Error: + " + e.getMessage());  
                
                // Practica básica, no implemento delay para rate-limit

                // Si ya agotamos los 3 intentos
                if (attempts == MAX_RETRIES)
                    throw new RuntimeException("\n[!!] No se pudo enviar la notificación después de " + MAX_RETRIES + " intentos");
            }
        }
    }

    // NotificationManager.java - Código a refactorizar
    // TODO: Separar en clases diferentes: EmailService, SMSService, PushService
    // TODO: Aplicar patrón Strategy para los tipos de notificación
    // TODO: Añadir sistema de logs
    // TODO: Añadir método para enviar a múltiples destinatarios
    // TODO: Añadir sistema de reintentos
    // TODO: Añadir validación de parámetros
}
