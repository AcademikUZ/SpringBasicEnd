package fan.company.springbasicend.payload;


import lombok.Data;

@Data
public class CurrencyDto  {

    private String name;

    private boolean active = true;
}
