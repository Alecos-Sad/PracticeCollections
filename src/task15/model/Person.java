package task15.model;

import lombok.*;

import java.util.List;

@Getter
@Setter
public class Person extends BaseModel{

    private String lastName;
    private List<Profit> profitList;

    public Person(String name, String lastName, List<Profit> profitList) {
        super(name);
        this.lastName = lastName;
        this.profitList = profitList;
    }
}
