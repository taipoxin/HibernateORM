package dao;

import mapping.MastersEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


@Repository
public interface MastersRepository extends CrudRepository<MastersEntity, Integer> {

    @Query("select m from MastersEntity m where m.login = :login")
    MastersEntity findByLogin(@Param("login") String login);

}
