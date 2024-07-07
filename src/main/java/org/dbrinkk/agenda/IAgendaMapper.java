package org.dbrinkk.agenda;

import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface IAgendaMapper {
    Agenda toEntity(AgendaDto dto);
    AgendaDto toDto(Agenda entity);
    List<Agenda> toEntityList(List<AgendaDto> dtos);
    List<AgendaDto> toDtoList(List<Agenda> entities);
}
