package fan.company.springbasicend.repository;

import fan.company.springbasicend.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
