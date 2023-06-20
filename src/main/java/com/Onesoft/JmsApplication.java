package com.Onesoft;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

@SpringBootApplication
public class JmsApplication {
	@Autowired
	private Mailservice senderservice;

	public static void main(String[] args) {
		SpringApplication.run(JmsApplication.class, args);
	}
	@EventListener(ApplicationReadyEvent.class)
	public void sendmail() {
		senderservice.sendmail("rr947997@gmail.com", "mail sending","This is simplest mail sending model");
	}

}
