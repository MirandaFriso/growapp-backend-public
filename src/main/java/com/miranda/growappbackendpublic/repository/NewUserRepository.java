package com.miranda.growappbackendpublic.repository;

import com.miranda.growappbackendpublic.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface NewUserRepository extends JpaRepository<User, Long> {
    Optional<User> findByUsername(String username);
    Boolean existsByUsername(String username);
    Boolean existsByEmail(String email);
}
