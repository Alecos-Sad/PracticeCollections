package task15;

import task15.model.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class TaxOffice {

    public void sortByTaxSum(){
        List<Person> personList = getPersonList();
        for (Person person : personList) {
            List<Profit> profitList = person.getProfitList();
            profitList.sort(Comparator.comparing(Profit::getTaxSum));
            for (Profit profit : person.getProfitList()) {
                System.out.println(profit.getTaxSum());
            }
        }
    }

    private List<Person> getPersonList() {
        List<Profit> profitList1 = new ArrayList<>();
        profitList1.add(new Profit(200_000.0,new MainWorkTax(20.0)));
        profitList1.add(new Profit(200_000.0,new ExtraWorkTax(20.0)));
        Person person1 = new Person("pers1", "lst1", profitList1);

        List<Profit> profitList2 = new ArrayList<>();
        profitList2.add(new Profit(150_000.0,new SaleTax(10.0)));
        profitList2.add(new Profit(350_000.0,new GiftTax(5.0)));
        profitList2.add(new Profit(500_000.0,new AwardTax(20.0)));
        Person person2 = new Person("pers2", "lst2", profitList2);
        return Arrays.asList(person1, person2);
    }
}
