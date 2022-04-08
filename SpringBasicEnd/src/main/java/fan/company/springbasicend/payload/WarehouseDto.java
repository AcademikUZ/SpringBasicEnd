package fan.company.springbasicend.payload;

import lombok.Data;

@Data
public class WarehouseDto {

    private String name;

    private boolean active = true;
}
