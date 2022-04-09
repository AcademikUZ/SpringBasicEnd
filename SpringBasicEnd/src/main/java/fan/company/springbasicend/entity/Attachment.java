package fan.company.springbasicend.entity;

import fan.company.springbasicend.entity.templates.AbsEntity;
import fan.company.springbasicend.entity.templates.AbsForIdEntity;
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
public class Attachment extends AbsEntity {

    private long size;
    private String contentType;
    private String originalName;

}
