package fan.company.springbasicend.repository;

import fan.company.springbasicend.entity.Currency;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CurrencyRepository extends JpaRepository<Currency, Long> {
}
