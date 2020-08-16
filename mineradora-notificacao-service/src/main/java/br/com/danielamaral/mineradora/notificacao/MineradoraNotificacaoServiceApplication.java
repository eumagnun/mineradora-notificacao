package br.com.danielamaral.mineradora.notificacao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class MineradoraNotificacaoServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MineradoraNotificacaoServiceApplication.class, args);
	}

}
