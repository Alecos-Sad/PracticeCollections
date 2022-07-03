package task15.model;

public class SaleTax extends Tax{

    public SaleTax(Double percentage) {
        super("Sale Tax - Доход от продажи", percentage);
    }
}
