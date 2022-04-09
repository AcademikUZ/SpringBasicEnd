package fan.company.springbasicend.entity;

import fan.company.springbasicend.entity.templates.AbsAllEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Entity;


@EqualsAndHashCode(callSuper = true)
@Data
@Entity
public class Measurement extends AbsAllEntity {

    public Measurement() {
    }
}
