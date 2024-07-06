package org.dbrinkk.agenda;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AgendaService implements IAgendaService {

    @Autowired
    private IAgendaRepository repo;

    public Agenda AddAsync(Agenda entity) {
        if (entity == null) {
            throw new IllegalArgumentException();
        }

        return this.repo.save(entity);
    }

    public List<Agenda> GetAllAsync() {
        return this.repo.findAll();
    }
}
