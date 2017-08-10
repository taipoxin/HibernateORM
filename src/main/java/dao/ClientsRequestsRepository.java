package dao;

import mapping.ClientsRequestsEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ClientsRequestsRepository extends CrudRepository<ClientsRequestsEntity, Integer> {
    ClientsRequestsEntity findByLogin(String login);
}
