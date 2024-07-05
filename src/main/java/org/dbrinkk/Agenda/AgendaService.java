package org.dbrinkk.Agenda;

import org.springframework.stereotype.Service;

@Service
public class AgendaService implements IAgendaService {

    @Override()
    public String SayHello() {
        return "Hello!";
    }
}
