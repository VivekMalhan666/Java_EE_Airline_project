/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;
import java.util.Properties;  
  
import javax.mail.*;  
import javax.mail.internet.InternetAddress;  
import javax.mail.internet.MimeMessage;  
/**
 *
 * @author Raghda
 */
public class Mailer {
    public static void send(String to,String subject,String msg){  
  
final String user="raghdasaif2@gmail.com"; 
final String pass="raghda";  
  
  
Properties props = new Properties();  
props.put("mail.smtp.host", "smtp.gmail.com"); 
props.put("mail.smtp.auth", "true");  
  props.put("mail.smtp.starttls.enable", "true");
  props.put("mail.smtp.port", "587");
Session session = Session.getDefaultInstance(props,  
 new javax.mail.Authenticator() {  
  protected PasswordAuthentication getPasswordAuthentication() {  
   return new PasswordAuthentication(user,pass);  
   }  
});  
 
try {  
 MimeMessage message = new MimeMessage(session);  
 message.setFrom(new InternetAddress(user));  
 message.addRecipient(Message.RecipientType.TO,new InternetAddress(to));  
 message.setSubject(subject);  
 message.setText(msg);  
   
 
 Transport.send(message);  
  
 System.out.println("Done");  
  
 } catch (MessagingException e) {  
    throw new RuntimeException(e);  
 }  
      
}  
}
