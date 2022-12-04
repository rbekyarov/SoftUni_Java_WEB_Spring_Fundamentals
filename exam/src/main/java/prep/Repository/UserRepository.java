package prep.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import prep.model.entity.User;
@Repository
public interface UserRepository extends JpaRepository<User, String> {
}
