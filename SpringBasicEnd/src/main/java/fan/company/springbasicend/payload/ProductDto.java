package fan.company.springbasicend.payload;


import lombok.Data;


@Data
public class ProductDto {

    private Category category;
    private String code;
    private Long photoId;
    private Long measurementId;
    private String name;
    private boolean active = true;


}
