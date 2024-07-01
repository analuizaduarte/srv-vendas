package vendas.service;

import org.springframework.beans.factory.annotation.Autowired;
import vendas.model.Client;
import vendas.repository.ClientRepository;

public class ClientService {

    @Autowired //injecao de dependencias
    private ClientRepository repository;

    public void saveClient(Client client){
        validateClient(client);
        this.repository.insertClient(client);
    }

    public void validateClient(Client client){
        //aplica validacoes
    }


}
