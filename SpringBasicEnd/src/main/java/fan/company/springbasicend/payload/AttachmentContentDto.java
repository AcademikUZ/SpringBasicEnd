package fan.company.springbasicend.payload;

import fan.company.springbasicend.entity.templates.AbsForIdEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;


@EqualsAndHashCode(callSuper = true)
@Data

public class AttachmentContentDto extends AbsForIdEntity {

    private byte[] bytes;
    private Long attachmentId;

}
