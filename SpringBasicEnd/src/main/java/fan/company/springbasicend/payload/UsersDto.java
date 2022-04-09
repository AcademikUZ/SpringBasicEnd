package fan.company.springbasicend.payload;


import lombok.Data;

import java.util.Set;

@Data

public class UsersDto {

    private String firstName;
    private String lastName;
    private String code;
    private String password;
    private String phoneNumber;
    private boolean active;
    private Long warehousesId;


}
