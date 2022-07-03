package task07;

import task07.Model.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Biker {

    public void fullSum() {
        double price = getEquipment().stream().mapToDouble(Equipment::getPrice).sum();
        System.out.println(price);
    }

    public void sortByWeight() {
        getEquipment().stream().sorted(Comparator.comparing(Equipment::getWeight)).collect(Collectors.toList()).forEach(System.out::println);
    }

    public void search(double from, double to) {
        List<Equipment> equipmentList = getEquipment();
        List<Equipment> result = new ArrayList<>();
        for (Equipment equipment : equipmentList) {
            if (equipment.getPrice() >= from && equipment.getPrice() <= to) {
                result.add(equipment);
            }
        }
        result.forEach(System.out::println);
    }

    private List<Equipment> getEquipment() {
        List<Equipment> equipmentList = new ArrayList<>();
        Collections.addAll(equipmentList,
                new Helmet(1000, 1000),
                new Trousers(300, 5000),
                new Jacket(500, 7000),
                new Gloves(100, 200),
                new Boots(400, 2000)
        );
        return equipmentList;
    }
}
