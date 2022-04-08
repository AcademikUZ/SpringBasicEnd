package fan.company.springbasicend.payload;

import fan.company.springbasicend.entity.templates.AbsAllEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;


@Data

public class CategoryDto{

    private Long parrentCategory;
    private String name;
    private boolean active = true;

}
