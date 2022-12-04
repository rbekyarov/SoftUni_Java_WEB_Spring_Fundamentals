package prep.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import prep.model.entity.Category;
@Repository
public interface CategoryRepository extends JpaRepository<Category, String> {
}
