package inf.nextti.rest.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//anotação para identificar que a classe de spirng boot e irá inicializar a aplicação
@SpringBootApplication

// anotação para dizer quais pacotes devem ser escaneados
// OBS: se vc não passar os packpages, por padrão vai ser escaneados todos os pacotes aparti do atual
/*@ComponentScan(
        basePackages = {
                "inf.nextti.rest.api.service",
                "inf.nextti.rest.api.repository",
                "inf.nextti.rest.api.controller",
                "inf.nextti.rest.api.config"
        })
 */
// anotação para dizer que essa classe é um controlador rest
@RestController
public class VendasApplication {

    //@Autowired // informa do que vai usar variaveis de connfiguração
    //@Qualifier("applicationName")// pegando o valor da varieavel setado na class de configurarion
    @Value("${application.name}") // usar os values do application.properties
    private String applicationName;

    // metodo principal da aplicação
    public static void main(String[] args) {
        //metodo para inicializar a plicação
        SpringApplication.run(VendasApplication.class, args);
    }

    // adicionando metodo GET e um namespace
    @GetMapping("/hello")
    public String helloWorld() {
        return applicationName;
    }
}
