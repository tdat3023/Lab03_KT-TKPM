package spring.SpringJWT.repo;

import org.springframework.stereotype.Repository;
import spring.SpringJWT.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface UserRepo extends JpaRepository<User,Long> {
    User findByUsername (String username);
}
