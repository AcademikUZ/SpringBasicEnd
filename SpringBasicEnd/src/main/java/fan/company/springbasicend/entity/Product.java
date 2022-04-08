package fan.company.springbasicend.entity;

import fan.company.springbasicend.entity.templates.AbsAllEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Product extends AbsAllEntity {

    @ManyToOne
    private Category category;

    @Column(nullable = false)
    private String code;

    @ManyToOne
    private Attachment photoId;

    @ManyToOne
    private Measurement measurement;

}
