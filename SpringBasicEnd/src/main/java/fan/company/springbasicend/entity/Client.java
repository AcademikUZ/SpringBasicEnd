package fan.company.springbasicend.entity;

import fan.company.springbasicend.entity.templates.AbsAllEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;

@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Client extends AbsAllEntity {

    private String phoneNumber;
}
