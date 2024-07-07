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

    @PostMapping()
    public AgendaDto addAsync(@RequestBody AgendaDto dto) {
        return this.service.addAsync(dto);
    }

    @GetMapping("allByUserId")
    public List<AgendaDto> getByUserIdAsync(@RequestParam("userId") Long userId) {
        return this.service.getByUserIdAsync(userId);
    }

    @DeleteMapping()
    public boolean deleteByIdAsync(@RequestParam("id") Long id) {
        return this.service.deleteByIdAsync(id);
    }
}
