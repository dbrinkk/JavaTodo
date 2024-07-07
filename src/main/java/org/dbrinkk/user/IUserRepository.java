package org.dbrinkk.user;

import org.springframework.data.jpa.repository.JpaRepository;

public interface IUserRepository extends JpaRepository<TodoUser, Long> {
}
