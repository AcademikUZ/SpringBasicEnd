package fan.company.springbasicend.payload;



import lombok.Data;


@Data
public class MeasurementDto  {

    private String name;

    private boolean active = true;

}
