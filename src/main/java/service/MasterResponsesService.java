package service;

import mapping.MasterResponsesEntity;


public interface MasterResponsesService {
    MasterResponsesEntity addResponse(MasterResponsesEntity resp);
    void delete(int id);
    MasterResponsesEntity editResponse(MasterResponsesEntity resp);
    Iterable<MasterResponsesEntity> getAll();
}
