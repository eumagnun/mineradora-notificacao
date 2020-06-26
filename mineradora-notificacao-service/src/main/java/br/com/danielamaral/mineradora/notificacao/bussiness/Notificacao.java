package br.com.danielamaral.mineradora.notificacao.bussiness;

import br.com.danielamaral.mineradora.notificacao.dto.DadosNotificacaoDto;

public interface Notificacao {

	public void enviar(DadosNotificacaoDto dadosNotificacaoDto);
}
