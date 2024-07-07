package org.dbrinkk.agendaTodo;

import org.springframework.data.jpa.repository.JpaRepository;

public interface IAgendaTodoRepository extends JpaRepository<AgendaTodo, Long> {
}
