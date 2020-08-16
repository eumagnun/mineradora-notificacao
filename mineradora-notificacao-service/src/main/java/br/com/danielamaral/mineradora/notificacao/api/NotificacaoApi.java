package br.com.danielamaral.mineradora.notificacao.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.danielamaral.mineradora.notificacao.bussiness.Notificacao;
import br.com.danielamaral.mineradora.notificacao.dto.DadosNotificacaoDto;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/api/v1/noticacao")
public class NotificacaoApi {

	@Autowired
	Notificacao notificacao;

	@ApiOperation(value = "Envia uma notificação via e-mail. Recurso criado para uso por outros sistemas")
	@PostMapping(value="/email",produces = "application/json")
	public void postarNotificacoes(@RequestBody DadosNotificacaoDto dadosNotificacao) {
		dadosNotificacao.setEmailRemetente("contato@mineradora.com.br");
		notificacao.enviar(dadosNotificacao); 
	}
}
