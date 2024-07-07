package org.dbrinkk.agenda;

import java.util.List;

public interface IAgendaService {
    AgendaDto addAsync(AgendaDto dto);
    boolean deleteByIdAsync(Long id);
    List<AgendaDto> getByUserIdAsync(Long userId);
}
