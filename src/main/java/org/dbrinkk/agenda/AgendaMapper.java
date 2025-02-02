package org.dbrinkk.agenda;

import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public class AgendaMapper {

    public Agenda toEntity(AgendaDto dto) {
        Agenda entity = new Agenda();
        entity.setId(dto.getId());
        entity.setTitle(dto.getTitle());
        entity.setCreatedOn(dto.getCreatedOn());
        entity.setCreatedBy(dto.getCreatedBy());
        return entity;
    }

    public AgendaDto toDto(Agenda entity) {
        AgendaDto dto = new AgendaDto();
        dto.setId(entity.getId());
        dto.setTitle(entity.getTitle());
        dto.setCreatedOn(entity.getCreatedOn());
        dto.setCreatedBy(entity.getCreatedBy());
        dto.setUserId(entity.getUser().getId());
        return dto;
    }

    public List<Agenda> toEntityList(List<AgendaDto> dtos) {
        return dtos.stream().map(this::toEntity).toList();
    }

    public List<AgendaDto> toDtoList(List<Agenda> entities) {
        return entities.stream().map(this::toDto).toList();
    }
}
