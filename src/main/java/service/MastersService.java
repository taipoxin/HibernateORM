package service;

import mapping.MastersEntity;


public interface MastersService {
    MastersEntity addMaster(MastersEntity master);
    void delete(int id);
    MastersEntity getByLogin(String name);
    MastersEntity editMaster(MastersEntity master);
    Iterable<MastersEntity> getAll();
}
