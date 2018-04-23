package de.digitalpub.controller.repository;

import de.digitalpub.controller.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long>{
}