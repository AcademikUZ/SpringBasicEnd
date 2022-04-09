package fan.company.springbasicend.repository;

import fan.company.springbasicend.entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {
}
