package org.dbrinkk.agenda;

import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Tag(name = "AgendaController")
@RequestMapping(value = "/agenda")
public class AgendaController {

    @Autowired()
    private AgendaService service;

    @GetMapping()
    public List<AgendaDto> GetByUserIdAsync(@RequestParam("userId") Long userId) {
        return service.GetByUserIdAsync(userId);
    }

    @PostMapping()
    public Agenda AddAsync(@RequestBody Agenda entity) {
        return service.AddAsync(entity);
    }
}
