package org.dbrinkk.Agenda;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class AgendaController {

    @Autowired()
    private AgendaService service;

    @GetMapping("/hello")
    public String SayHello() {
        return service.SayHello();

    }
}
