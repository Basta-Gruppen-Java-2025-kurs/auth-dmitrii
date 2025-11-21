package se.dimage.authOne.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import se.dimage.authOne.model.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Role findByName(String name);
}
