package inf.nextti.rest.api.repository;

import inf.nextti.rest.api.model.Cliente;
import org.springframework.stereotype.Repository;

// anotacao pra dizer que a classe e um repository
@Repository
public class ClientesRepository {

    public void persistir(Cliente cliente){
    // acessa a base e salvar o cliente
    }
}
