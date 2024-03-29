package fan.company.springbasicend.entity;

import fan.company.springbasicend.entity.templates.AbsAllEntity;
import fan.company.springbasicend.entity.templates.AbsForIdEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;

@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@Data
@Entity
public class Currency extends AbsAllEntity {
}
