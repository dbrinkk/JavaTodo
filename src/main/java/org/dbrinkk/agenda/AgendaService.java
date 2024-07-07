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

    public AgendaDto AddAsync(AgendaDto dto) {
        if (dto == null) {
            throw new IllegalArgumentException();
        }

        Agenda entity = this.mapper.toEntity(dto);
        Agenda result = this.repo.save(entity);
        return this.mapper.toDto(result);
    }

    public List<AgendaDto> GetByUserIdAsync(Long userId) {
        List<Agenda> results = this.repo.findAllById(Collections.singletonList(userId));
        return this.mapper.toDtoList(results);
    }
}
