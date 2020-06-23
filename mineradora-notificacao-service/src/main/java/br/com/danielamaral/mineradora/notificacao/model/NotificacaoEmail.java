package br.com.danielamaral.mineradora.notificacao.model;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;

public class NotificacaoEmail implements Notificacao{

	@Override
	public void enviar(DadosNotificacao dadosNotificacao) {
		 try {
             Email email = new SimpleEmail();
             email.setHostName("smtp.googlemail.com");
             email.setSmtpPort(465);
             email.setAuthenticator(new DefaultAuthenticator("eumagnun@gmail.com", "rqowfoaynnrjwlxj"));
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
