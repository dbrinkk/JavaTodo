package org.dbrinkk.agenda;

import java.util.List;

public interface IAgendaService {
    AgendaDto AddAsync(AgendaDto dto);
    List<AgendaDto> GetByUserIdAsync(Long userId);
}
