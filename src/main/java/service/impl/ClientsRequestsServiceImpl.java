package service.impl;

import dao.ClientsRequestsRepository;
import mapping.ClientsRequestsEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import service.ClientsRequestsService;

@Service
public class ClientsRequestsServiceImpl implements ClientsRequestsService{

    @Autowired
    private ClientsRequestsRepository clientsRequestsRepository;


    public ClientsRequestsEntity addRequest(ClientsRequestsEntity request) {
        return clientsRequestsRepository.save(request);
    }

    public void delete(int id) {
        clientsRequestsRepository.delete(id);
    }

    public ClientsRequestsEntity editRequest(ClientsRequestsEntity request) {
        // hibernate will update it
        return clientsRequestsRepository.save(request);
    }

    public Iterable<ClientsRequestsEntity> getAll() {
        return clientsRequestsRepository.findAll();
    }
}
