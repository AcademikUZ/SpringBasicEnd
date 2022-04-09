package fan.company.springbasicend.repository;

import fan.company.springbasicend.entity.Product;
import fan.company.springbasicend.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersRepository extends JpaRepository<Users, Long> {
    Users findTopByOrderByIdDesc();
}
