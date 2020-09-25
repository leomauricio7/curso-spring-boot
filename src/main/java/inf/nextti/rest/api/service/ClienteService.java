package inf.nextti.rest.api.service;

import inf.nextti.rest.api.model.Cliente;
import inf.nextti.rest.api.repository.ClientesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

// anotação para informar que a classe é um service
@Service
public class ClienteService {
    // inicializando o Cliente repository
    private ClientesRepository repository;

    @Autowired // busca instancia e criar no container uma instancia do respository via injeção de dependencias
    // construtor
    public ClienteService(ClientesRepository repository) {
        this.repository = repository;
    }

    public void salvarCliente(Cliente cliente) {
        // chamando metodo de validar cliente
        validaCLiente(cliente);
        this.repository.persistir(cliente);

    }

    public void validaCLiente(Cliente cliente) {
        //aplica validacoes

    }
}
