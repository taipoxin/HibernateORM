package dao;

import mapping.ClientsEntity;
import org.springframework.beans.factory.annotation.Autowired;

public class SomeClient {

    @Autowired
    private ClientsRepository clientsRepository;

    public void doSomething() {
        ClientsEntity client = clientsRepository.findByLogin("poor_user");
        System.out.println(client.getId());
        System.out.println(client.getLogin());
        System.out.println(client.getHash());

    }
}
