package fan.company.springbasicend.repository;

import fan.company.springbasicend.entity.Measurement;
import org.springframework.data.jpa.repository.JpaRepository;

import java.awt.print.Pageable;

public interface MeasurementRepository extends JpaRepository<Measurement, Long> {

}
