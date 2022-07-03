package task15.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

public class Profit {

    private final Double sum;
    @Getter
    @Setter
    private Tax tax;

    public Profit(Double sum, Tax tax) {
        this.sum = sum;
        this.tax = tax;
    }

    public Double getDirtySum(){
        return sum;
    }

    public Double getClearSum() {
        return sum - (sum / 100 * tax.getPercentage());
    }

    public Double getTaxSum(){
        return sum / 100 * tax.getPercentage();
    }
}
