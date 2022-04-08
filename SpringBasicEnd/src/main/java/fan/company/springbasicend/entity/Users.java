package fan.company.springbasicend.entity;

import fan.company.springbasicend.entity.templates.AbsForIdEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import java.util.Set;

@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Users extends AbsForIdEntity {

    private String firstName;
    private String lastName;
    private String code;
    private String password;
    private String phoneNumber;
    private boolean active;

    @ManyToMany
    Set<Warehouse> warehouses;


}
