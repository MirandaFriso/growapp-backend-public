package com.miranda.growappbackendpublic.repository;

import com.miranda.growappbackendpublic.models.ERole;
import com.miranda.growappbackendpublic.models.Role;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(ERole name);
}
