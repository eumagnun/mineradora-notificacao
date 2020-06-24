package br.com.danielamaral.mineradora.notificacao.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DadosNotificacao {

	private String emailRemetente;
	private String nomeDestinatario;
	private String emailDestinatario;
	private String titulo;
	private String mensagem;
}
