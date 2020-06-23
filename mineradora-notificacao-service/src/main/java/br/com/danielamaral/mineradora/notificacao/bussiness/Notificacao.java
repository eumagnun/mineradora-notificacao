package br.com.danielamaral.mineradora.notificacao.bussiness;

import br.com.danielamaral.mineradora.notificacao.model.DadosNotificacao;

public interface Notificacao {

	public void enviar(DadosNotificacao dadosNotificacao);
}
