package br.com.danielamaral.mineradora.notificacao.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.danielamaral.mineradora.notificacao.bussiness.Notificacao;
import br.com.danielamaral.mineradora.notificacao.model.DadosNotificacao;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/api/v1/barragem")
public class NotificacaoApi {

	@Autowired
	Notificacao notificacao;

	@ApiOperation(value = "Postar Notificacoes")
	@PostMapping(produces = "application/json")
	public void postarNotificacoes() {
		DadosNotificacao dadosNotificacao = new DadosNotificacao();
		dadosNotificacao.setEmailDestinatario("eumagnun@gmail.com");
		dadosNotificacao.setEmailRemetente("jose@gmail.com");
		dadosNotificacao.setMensagem("Olá Mundo");
		dadosNotificacao.setNomeDestinatario("Pedro Da Silva");
		dadosNotificacao.setTitulo("Titulo Teste TCC");
		notificacao.enviar(dadosNotificacao); 
	}
}
