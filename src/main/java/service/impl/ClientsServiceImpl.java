package service.impl;

import dao.ClientsRepository;
import mapping.ClientsEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import service.ClientsService;



@Service
public class ClientsServiceImpl implements ClientsService {

    @Autowired
    private ClientsRepository clientsRepository;


    public ClientsEntity addClient(ClientsEntity client) {
        return clientsRepository.save(client);
    }

    public void delete(int id) {
        clientsRepository.delete(id);

    }

    public ClientsEntity getByLogin(String login) {
        return clientsRepository.findByLogin(login);
    }

    public ClientsEntity editClient(ClientsEntity client) {
        // hibernate will update it
        return clientsRepository.save(client);
    }

    public Iterable<ClientsEntity> getAll() {
        return clientsRepository.findAll();
    }
}
