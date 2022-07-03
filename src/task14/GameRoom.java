package task14;

import task14.model.*;

import java.util.*;
import java.util.stream.Collectors;

public class GameRoom {

    private List<Toy> toyList = getToyList();

    public void fillRoom(double fullPrice) {

        List<Toy> toys = getToyList();
        Collections.shuffle(toys);
        Set<Toy> toySet = new TreeSet<>(Comparator.comparing(Toy::getPrice));
        // List<Car> carList = toys.stream().filter(toy -> toy instanceof Car).map(toy -> (Car) toy).collect(Collectors.toList());
        // List<Other> otherList = toys.stream().filter(toy -> toy instanceof Other).map(toy -> (Other) toy).collect(Collectors.toList());
        int indx = 0;
        while (toySet.stream().mapToDouble(Toy::getPrice).sum() <= fullPrice) {
            toySet.add(toys.get(indx));
            indx++;
        }
        toySet.forEach(System.out::println);

        int a = (int) toySet.stream().filter(toy -> toy instanceof Car).count();
        int b = (int) toySet.stream().filter(toy -> toy instanceof Other).count();
        double difference = toySet.stream().mapToDouble(Toy::getPrice).sum() - fullPrice;
        //Optional<Toy> max = toySet.stream().min(Comparator.comparing(Toy::getPrice));
        toySet.removeIf(
                a > b ? toy -> toy instanceof Car && toy.getPrice() >= difference :
                        toy -> toy instanceof Other && toy.getPrice() >= difference
        );
        toySet.forEach(System.out::println);
        System.out.println(toySet.stream().mapToDouble(Toy::getPrice).sum());
    }

    public void sort() {
        toyList.sort(Comparator.comparing(Toy::getPrice));
        toyList.forEach(System.out::println);
    }

    public void search(double from, double to) {
        List<Toy> result = new ArrayList<>();
        for (Toy toy : toyList) {
            if (toy.getPrice() >= from && toy.getPrice() <= to) {
                result.add(toy);
            }
        }
        result.forEach(System.out::println);
    }

    private List<Toy> getToyList() {
        List<Toy> toyList = new ArrayList<>();
        Collections.addAll(toyList, new SmallCar(), new MiddleCar(), new BigCar(), new Doll(), new Cube(), new Ball());
        return toyList;
    }
}
