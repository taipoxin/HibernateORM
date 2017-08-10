package dao;


import mapping.ClientsEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


@Repository
public interface ClientsRepository extends CrudRepository<ClientsEntity, Integer> {

    @Query("select c from ClientsEntity c where c.login = :login")
    ClientsEntity findByLogin(@Param("login") String login);


}
