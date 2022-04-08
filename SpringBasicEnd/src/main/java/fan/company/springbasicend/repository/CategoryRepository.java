package fan.company.springbasicend.repository;

import fan.company.springbasicend.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
