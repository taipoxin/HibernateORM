package service;

import mapping.ClientsEntity;


public interface ClientsService {
    ClientsEntity addClient(ClientsEntity client);
    void delete(int id);
    ClientsEntity getByLogin(String name);
    ClientsEntity editClient(ClientsEntity client);
    Iterable<ClientsEntity> getAll();
}
