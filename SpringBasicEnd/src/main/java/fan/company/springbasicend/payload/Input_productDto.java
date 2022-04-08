package fan.company.springbasicend.payload;


import lombok.Data;

import java.util.Date;


@Data

public class Input_productDto {


    private Long productId;

    private Double amount;

    private Double price;

    private Date date;

    private Long inputId;

}
