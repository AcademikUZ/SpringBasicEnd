package fan.company.springbasicend.payload;

import fan.company.springbasicend.entity.templates.AbsEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class AttachmentDto extends AbsEntity {

    private long size;
    private String contentType;

}
