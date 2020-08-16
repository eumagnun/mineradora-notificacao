package br.com.danielamaral.mineradora.notificacao.dto;

import io.swagger.annotations.ApiModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ApiModel(value = "DadosNotificacao")
public class DadosNotificacaoDto {

	private String emailRemetente;
	private String nomeDestinatario;
	private String emailDestinatario;
	private String titulo;
	private String mensagem;
}
