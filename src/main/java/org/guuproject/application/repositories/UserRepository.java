package org.guuproject.application.repositories;


import org.guuproject.application.models.Image;
import org.guuproject.application.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {
    User findUserByUsername(String email);
    User findUserById(Long id);
}
