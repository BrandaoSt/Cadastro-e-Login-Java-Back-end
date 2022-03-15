package br.com.eurotrip.services;

import org.springframework.mail.SimpleMailMessage;

import br.com.eurotrip.models.Usuario;

public interface EmailService {
	
	void sendEmail(SimpleMailMessage msg);
	
	void sendNewPasswordEmail(Usuario usuario, String newPass);
}
