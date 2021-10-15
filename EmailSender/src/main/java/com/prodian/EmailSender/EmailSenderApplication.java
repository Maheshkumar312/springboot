package com.prodian.EmailSender;

import javax.mail.MessagingException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

@SpringBootApplication
public class EmailSenderApplication {

	@Autowired
	private EmailSenderService service;

	public static void main(String[] args) {
		SpringApplication.run(EmailSenderApplication.class, args);

	}

	@EventListener(ApplicationReadyEvent.class)
	public void triggerMail() throws MessagingException {

		service.sendSimpleEmail("maheshkumar312d@gmail.com", "this is body", "this is subject");
	}
//	@EventListener(ApplicationReadyEvent.class)
//	public void triggerMail() throws MessagingException {
//
//		service.sendEmailWithAttachment("maheshkumar312d@gmail.com",
//				"This is Email Body with Attachment...",
//				"This email has attachment",
//				"C:\\Users\\HP PC\\OneDrive\\Pictures\\mahesh.jpg.jpeg");
//
//	}
}
