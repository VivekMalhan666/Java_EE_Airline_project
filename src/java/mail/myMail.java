/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mail;

import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;


public class myMail {

    public myMail() {
    }

    public String SendFlightItinerary(String fname,String lname,String uemail, String FlightNumber, String Origin, String Destination, String num,String depart, String arrive) {
        uemail="raghdasaif2@gmail.com";
        final String myemail = "raghdasaif2@gmail.com";
        final String mypassword = "Lumia520";
        Properties props = new Properties();
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.port", "587");
        props.put("mail.smtp.ssl.trust", "*");
        Session session2 = Session.getInstance(props,   
                 new javax.mail.Authenticator()
                {
                    protected PasswordAuthentication getPasswordAuthentication()
                    {
                        return new PasswordAuthentication(myemail,mypassword);
                    }
                });

        try {
           // System.out.print("hello");
            Message message = new MimeMessage(session2);
            message.setFrom(new InternetAddress("raghdasaif2@gmail.com"));
            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(uemail));
            message.setSubject("Flight Itinerary");
            StringBuilder bodyText = new StringBuilder();
            bodyText.append("<div>").append("Dear Mr/Ms ").append(fname).append(" ").append(lname)
                    .append("<br/><br/>").append("You have booked ").append(num).append(" ")
                    
                    .append(" tickets in Airblue Airlines. <br/>")
                    .append("Your Flight Number is: ")
                    .append(FlightNumber)
                    .append("<br/>")
                    .append("Your flight is from: ")
                    .append(Origin)
                    .append(" to ")
                    .append(Destination)
                    .append("<br/>")
                    .append("Departure Time is: ")
                    .append(depart)
                    .append(" it will arrive at: ")
                    .append(arrive)
                    .append("<br/>")
                   
                    .append("Thanks<br/>")
                    .append("</div>");
            message.setContent(bodyText.toString(), "text/html; charset=utf-8");
            Transport.send(message);
            return "Sent";

        } catch (Exception e) {
             e.printStackTrace();
             return " not Sent";   
        }
    }
}
