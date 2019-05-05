package com.lgn.firmbook.metier.process.mail;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class SendMailProcess {

    public void send(String mail) {
        String user = "okya.corp@gmail.com";
        String psw = "azerty.1234";
        String[] to = {mail};
        String subject = "Welcome to our company";
        String body = getMail();

        Properties props = System.getProperties();
        String host = "smtp.gmail.com";
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", host);
        props.put("mail.smtp.user", user);
        props.put("mail.smtp.password", psw);
        props.put("mail.smtp.port", "587");
        props.put("mail.smtp.auth", "true");

        Session session = Session.getDefaultInstance(props);
        MimeMessage message = new MimeMessage(session);

        try {
            message.setFrom(new InternetAddress(user));
            InternetAddress[] toAddress = new InternetAddress[to.length];

            // To get the array of addresses
            for (int i = 0; i < to.length; i++) {
                toAddress[i] = new InternetAddress(to[i]);
            }

            for (InternetAddress toAddress1 : toAddress) {
                message.addRecipient(Message.RecipientType.TO, toAddress1);
            }

            message.setSubject(subject);
            message.setContent(body, "text/html");
            Transport transport = session.getTransport("smtp");
            transport.connect(host, user, psw);
            transport.sendMessage(message, message.getAllRecipients());
            transport.close();
            System.out.println("message send");
        } catch (MessagingException ae) {
            ae.printStackTrace();
        }
    }

    private static String getMail() {
        StringBuilder sb = new StringBuilder();
        try {
            BufferedReader reader;
            reader = new BufferedReader(new FileReader(SendMailProcess.class.getResource("/welcome.html").toExternalForm().substring(6)));
            String line = reader.readLine();
            while (line != null) {
                sb.append(line);
                line = reader.readLine();
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return sb.toString();
    }
}
