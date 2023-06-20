package com.Onesoft;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Mailservice {
	@Autowired
	private JavaMailSender mailSender;
	
	public void sendmail(String toEmail,String subject,String body) {
		SimpleMailMessage msg=new SimpleMailMessage();
		msg.setFrom("pkgobidinesh@gmail.com");
		msg.setTo(toEmail);
		msg.setText(body);
		msg.setSubject(subject);
		
		mailSender.send(msg);
		System.out.println("the mail send successfully");
	}

}
