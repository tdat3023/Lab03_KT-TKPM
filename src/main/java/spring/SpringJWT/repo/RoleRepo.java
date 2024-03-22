package spring.SpringJWT.repo;

import org.springframework.stereotype.Repository;
import spring.SpringJWT.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface RoleRepo extends JpaRepository<Role,Long> {
    Role findByName(String name);
}
