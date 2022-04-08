package fan.company.springbasicend.payload;


import lombok.Data;

@Data
public class SupplierDto {

    private String phoneNumber;
    private String name;
    private boolean active = true;


}
