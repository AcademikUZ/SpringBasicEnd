package fan.company.springbasicend.repository;

import fan.company.springbasicend.entity.Input;
import fan.company.springbasicend.entity.Output;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OutputRepository extends JpaRepository<Output, Long> {
    Output findTopByOrderByIdDesc();
}
