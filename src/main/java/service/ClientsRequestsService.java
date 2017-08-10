package service;

import mapping.ClientsRequestsEntity;

public interface ClientsRequestsService {
    ClientsRequestsEntity addRequest(ClientsRequestsEntity req);
    void delete(int id);
    ClientsRequestsEntity editRequest(ClientsRequestsEntity req);
    Iterable<ClientsRequestsEntity> getAll();
}
