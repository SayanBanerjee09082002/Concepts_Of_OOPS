package XII_ObjectModel.CreationalDesignPattern;

import java.util.UUID;

//Factory pattern use a factory class to create desirable objects of a class. This hides the logic behind the class

interface Notification {
    void notification();

    default String getNotificationIUUID() {
        return UUID.randomUUID().toString();
    }
}

class SMSNotification implements Notification{
    private String message;

    public SMSNotification(String message) {
        this.message = message;
    }


    @Override
    public void notification() {
        System.out.println("SMS Notification: " + getNotificationIUUID() + "\n" + message);
    }
}

class EmailNotification implements Notification{
    private String message;

    public EmailNotification(String message) {
        this.message = message;
    }


    @Override
    public void notification() {
        System.out.println("Email Notification: " + getNotificationIUUID() + "\n" + message);
    }
}

class WhatsAppNotification implements Notification{
    private String message;

    public WhatsAppNotification(String message) {
        this.message = message;
    }


    @Override
    public void notification() {
        System.out.println("WhatsApp Notification: " + getNotificationIUUID() + "\n" + message);
    }
}


class FactoryExample {
    public Notification createNotification (String channel, String message) {
        if (channel.isEmpty() || channel.isBlank() || channel == null)
            return null;
        else {
            switch (channel) {
                case "SMS", "sms":
                    return new SMSNotification(message);
                case "EMAIL", "Email", "email":
                    return new EmailNotification(message);
                case "WHATSAPP", "Whatsapp", "WhatsApp", "whatsapp" :
                    return new WhatsAppNotification(message);
                default:
                    throw new IllegalArgumentException("Unknown channel "+channel);
            }
        }
    }
}

public class II_FactoryPattern {
    public static void main(String[] args)
    {
        FactoryExample factoryExample = new FactoryExample();

        Notification notification1 = factoryExample.createNotification("Email", "Welcome to OOPS course");
        Notification notification2 = factoryExample.createNotification("WhatsApp", "You may leave OOPS but OOPS will not leave you");
        Notification notification3 = factoryExample.createNotification("SMS", "Please write less and bring down average");

        notification1.notification();
        notification2.notification();
        notification3.notification();
    }
}
