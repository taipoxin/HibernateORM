package dao;

import mapping.MasterResponsesEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface MasterResponsesRepository extends CrudRepository<MasterResponsesEntity, Integer> {
}

