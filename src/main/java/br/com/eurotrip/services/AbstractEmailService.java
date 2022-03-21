package br.com.eurotrip.services;

import java.util.Date;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;

import br.com.eurotrip.models.Usuario;

public abstract class AbstractEmailService implements EmailService {
	
	@Value("${default.sender}")
	private String sender;
	
	@Override
	public void sendNewPasswordEmail(Usuario usuario, String newPass) {
		SimpleMailMessage sm = prepareNewPasswordEmail(usuario, newPass);
		sendEmail(sm);
	}
	
	protected SimpleMailMessage prepareNewPasswordEmail(Usuario usuario, String newPass) {
		SimpleMailMessage sm = new SimpleMailMessage();
		sm.setTo(usuario.getEmail());
		sm.setFrom(sender);
		sm.setSubject("Recuperação de Senha EUROTRIP");
		sm.setSentDate(new Date(System.currentTimeMillis()));
		sm.setText("Por favor, use a seguinte senha para fazer login em sua conta Eurotrip."
				+ "Nova senha: " + newPass + "  "
				+ "Se você não solicitou uma alteração de senha, sinta-se à vontade para ignorar esta mensagem.\r\n"
				+ "\r\n"
				+ "Para dúvidas, sugestões ou reclamações não hesite em nos contatar através da nossa equipe de suporte no portal de Contato Eurotrip ou sinta-se à vontade para responder a este e-mail. "
				+ "Ele foi enviado de um endereço de e-mail monitorado e gostaríamos de receber sua mensagem. "
				+ "A Eurotrip agradece o seu contato. Até mais!");
		return sm;
	}
}