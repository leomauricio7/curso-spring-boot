package inf.nextti;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//anotação para identificar que a classe irá inicializar a aplicação
@SpringBootApplication
// anotação para dizer que essa classe é um controlador rest
@RestController
public class VendasApplication {
    // metodo principal da aplicação
    public static void main(String[] args) {
        //metodo para inicializar a plicação
        SpringApplication.run(VendasApplication.class, args);
    }
    // adicionando metodo GET e um namespace
    @GetMapping("/hello")
    public String helloWorld() {
        return "hello world";
    }
}
