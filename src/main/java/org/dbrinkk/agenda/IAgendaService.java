package org.dbrinkk.agenda;

import java.util.List;

public interface IAgendaService {
    Agenda AddAsync(Agenda entity);
    List<Agenda> GetAllAsync();
}
