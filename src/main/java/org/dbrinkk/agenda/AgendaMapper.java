package org.dbrinkk.agenda;

import org.dbrinkk.todoUser.ITodoUserRepository;
import org.dbrinkk.todoUser.TodoUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AgendaMapper implements IAgendaMapper {
    @Autowired
    private ITodoUserRepository todoRepo;

    @Override
    public Agenda toEntity(AgendaDto dto) {
        Agenda entity = new Agenda();
        entity.setId(dto.getId());
        entity.setTitle(dto.getTitle());
        entity.setCreatedOn(dto.getCreatedOn());
        entity.setCreatedBy(dto.getCreatedBy());
        Optional<TodoUser> userCheck = todoRepo.findById(dto.getUserId());
        TodoUser user = null;
        if (userCheck.isPresent()) {
            user = userCheck.get();
        }
        entity.setUser(user);
        return entity;
    }

    @Override
    public AgendaDto toDto(Agenda entity) {
        AgendaDto dto = new AgendaDto();
        dto.setId(entity.getId());
        dto.setTitle(entity.getTitle());
        dto.setCreatedOn(entity.getCreatedOn());
        dto.setCreatedBy(entity.getCreatedBy());
        dto.setUserId(entity.getUser().getId());
        return dto;
    }

    @Override
    public List<Agenda> toEntityList(List<AgendaDto> dtos) {
        return dtos.stream().map(this::toEntity).toList();
    }

    @Override
    public List<AgendaDto> toDtoList(List<Agenda> entities) {
        return entities.stream().map(this::toDto).toList();
    }
}
