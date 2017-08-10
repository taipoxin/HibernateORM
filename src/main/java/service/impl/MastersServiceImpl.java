package service.impl;

import dao.MastersRepository;
import mapping.MastersEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import service.MastersService;


@Service
public class MastersServiceImpl implements MastersService {

    @Autowired
    private MastersRepository mastersRepository;


    public MastersEntity addMaster(MastersEntity master) {
        return mastersRepository.save(master);
    }

    public void delete(int id) {
        mastersRepository.delete(id);

    }

    public MastersEntity getByLogin(String login) {
        return mastersRepository.findByLogin(login);
    }

    public MastersEntity editMaster(MastersEntity master) {
        // hibernate will update it
        return mastersRepository.save(master);
    }

    public Iterable<MastersEntity> getAll() {
        return mastersRepository.findAll();
    }
}
