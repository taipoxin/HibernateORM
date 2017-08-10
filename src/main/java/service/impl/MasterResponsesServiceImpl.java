package service.impl;

import dao.MasterResponsesRepository;
import mapping.MasterResponsesEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import service.MasterResponsesService;


@Service
public class MasterResponsesServiceImpl implements MasterResponsesService{

    @Autowired
    private MasterResponsesRepository masterResponsesRepository;


    public MasterResponsesEntity addResponse(MasterResponsesEntity response) {
        return masterResponsesRepository.save(response);
    }

    public void delete(int id) {
        masterResponsesRepository.delete(id);
    }

    public MasterResponsesEntity editResponse(MasterResponsesEntity response) {
        // hibernate will update it
        return masterResponsesRepository.save(response);
    }

    public Iterable<MasterResponsesEntity> getAll() {
        return masterResponsesRepository.findAll();
    }
}
