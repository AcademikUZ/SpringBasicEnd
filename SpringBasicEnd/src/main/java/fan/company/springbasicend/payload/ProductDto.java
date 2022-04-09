package fan.company.springbasicend.payload;


import lombok.Data;


@Data
public class ProductDto {

    private Long categoryId;
    private String code;
    private Long photoId;
    private Long measurementId;
    private String name;
    private boolean active = true;


}
