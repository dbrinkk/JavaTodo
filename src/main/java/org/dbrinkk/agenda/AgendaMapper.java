package org.dbrinkk.agenda;

import java.util.List;

public class AgendaMapper implements IAgendaMapper {
    @Override
    public Agenda toEntity(AgendaDto dto) {
        Agenda entity = new Agenda();
        entity.setId(dto.getId());
        entity.setTitle(dto.getTitle());
        entity.setCreatedOn(dto.getCreatedOn());
        entity.setCreatedBy(dto.getCreatedBy());
        return entity;
    }

    @Override
    public AgendaDto toDto(Agenda entity) {
        AgendaDto dto = new AgendaDto();
        dto.setId(entity.getId());
        dto.setTitle(entity.getTitle());
        dto.setCreatedOn(entity.getCreatedOn());
        dto.setCreatedBy(entity.getCreatedBy());
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
