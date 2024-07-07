package org.dbrinkk.todoUser;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ITodoUserRepository extends JpaRepository<TodoUser, Long> {
}
