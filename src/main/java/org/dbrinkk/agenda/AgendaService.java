package org.dbrinkk.agenda;

import org.dbrinkk.todoUser.ITodoUserRepository;
import org.dbrinkk.todoUser.TodoUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class AgendaService implements IAgendaService {

    @Autowired
    private IAgendaRepository repo;

    @Autowired
    private ITodoUserRepository todoUserRepo;
    private final AgendaMapper mapper = new AgendaMapper();

    public AgendaDto addAsync(AgendaDto dto) {
        if (dto == null) {
            throw new IllegalArgumentException();
        }

        Optional<TodoUser> existingUserCheck = this.todoUserRepo.findById(dto.getUserId());
        if (existingUserCheck.isEmpty()) {
            throw new IllegalArgumentException();
        }

        TodoUser user = existingUserCheck.get();
        Agenda entity = this.mapper.toEntity(dto);
        entity.setUser(user);
        Agenda result = this.repo.save(entity);
        return this.mapper.toDto(result);
    }

    public boolean deleteByIdAsync(Long id) {


        Optional<Agenda> existingAgendaCheck = this.repo.findById(id);
        if (existingAgendaCheck.isEmpty()) {
            throw new IllegalArgumentException();
        }

        this.repo.deleteById(id);
        return true;
    }

    public List<AgendaDto> getByUserIdAsync(Long userId) {
        List<Agenda> results = this.repo.findAll()
                .stream()
                .filter(x -> Objects.equals(x.getUser().getId(), userId))
                .toList();
        return this.mapper.toDtoList(results);
    }
}
