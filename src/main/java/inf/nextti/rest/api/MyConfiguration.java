package inf.nextti.rest.api;
// importando os pacotes

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//classe de configuração customizada da aplicação
//anotação para dizer que é uma classe de configuração
@Configuration
public class MyConfiguration {
    // utlizando o @Bean para utilizar o método no contexto da aplicação onde eu precisar
    @Bean(name = "applicationName")
    public String applicationName() {
        return "Sistema de Vendas";
    }

}
