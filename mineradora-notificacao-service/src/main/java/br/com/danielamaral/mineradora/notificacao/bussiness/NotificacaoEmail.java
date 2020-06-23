package br.com.danielamaral.mineradora.notificacao.bussiness;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import br.com.danielamaral.mineradora.notificacao.model.DadosNotificacao;


@Service
public class NotificacaoEmail implements Notificacao{
	
	@Value("${spring.mail.username}")
	private String userEmail;
	
	
	@Value("${spring.mail.password}")
	private String passEmail;

	@Override
	public void enviar(DadosNotificacao dadosNotificacao) {
		 try {
             Email email = new SimpleEmail();
             email.setHostName("smtp.googlemail.com");
             email.setSmtpPort(465);
             email.setAuthenticator(new DefaultAuthenticator(userEmail, passEmail));
             email.setSSLOnConnect(true);

             email.setFrom(dadosNotificacao.getEmailRemetente());
             email.setSubject(dadosNotificacao.getTitulo());
             email.setMsg(dadosNotificacao.getMensagem());
             email.addTo(dadosNotificacao.getEmailDestinatario());
             email.send();

         } catch (EmailException e) {
             e.printStackTrace();
         }		
	}

}
