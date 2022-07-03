package task15.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Tax extends BaseModel{

    private Double percentage;

    public Tax(String name, Double percentage) {
        super(name);
        this.percentage = percentage;
    }
}
