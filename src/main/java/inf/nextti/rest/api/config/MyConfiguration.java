package inf.nextti.rest.api.config;
// importando os pacotes

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

//classe de configuração customizada da aplicação
//anotação para dizer que é uma classe de configuração
@Configuration
@Profile("development") // serve para informa se essa configuração irar rodar em dev ou prod
public class MyConfiguration {
    // utlizando o @Bean para utilizar o método no contexto da aplicação onde eu precisar
    @Bean(name = "applicationName")
    public String applicationName() {
        return "Sistema de Vendas";
    }

    // bean o commandLineRunner -> para executar uma determianda acao assim que a aplicacao inicializa
    @Bean
    public CommandLineRunner init(){
        return args -> {
            System.out.println("RODANDO A CONFIGURAÇÃO DE DESENVOLVIEMNTO");
        };
    }

}
