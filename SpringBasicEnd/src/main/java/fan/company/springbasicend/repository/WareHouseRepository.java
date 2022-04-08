package fan.company.springbasicend.repository;

import fan.company.springbasicend.entity.Warehouse;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WareHouseRepository extends JpaRepository<Warehouse, Long> {
}
