package org.dbrinkk.agenda;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class AgendaService implements IAgendaService {

    @Autowired
    private IAgendaRepository repo;

    private final IAgendaMapper mapper = new AgendaMapper();

    public Agenda AddAsync(Agenda entity) {
        if (entity == null) {
            throw new IllegalArgumentException();
        }

        return this.repo.save(entity);
    }

    public List<AgendaDto> GetByUserIdAsync(Long userId) {
        List<Agenda> results = this.repo.findAllById(Collections.singletonList(userId));
        return this.mapper.toDtoList(results);
    }
}
