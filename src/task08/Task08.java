package task08;

import task08.model.Luggage;
import task08.model.PassMiddleWagon;
import task08.model.PassVIPWagon;
import task08.model.Passenger;
import task08.model.PassStandardWagon;
import task08.model.parent.PassengerWagon;
import task08.model.parent.Wagon;

import java.util.*;

public class Task08 {

    private List<PassengerWagon> wagonList;

    public Task08() {
        this.wagonList = getTrain();
    }

    public void show() {
        wagonList.forEach(System.out::println);
    }

    public void sortByLevel() {
        wagonList.sort(Comparator.comparing(PassengerWagon::getLevel));
        wagonList.forEach(System.out::println);
    }

    public void countPassengers() {
        int passengerCount;
        int luggageCount;
        passengerCount = wagonList.stream().mapToInt(wagon -> wagon.getPassengerList().size()).sum();
        luggageCount = wagonList.stream().flatMap(wagon -> wagon.getPassengerList().stream()).mapToInt(passenger -> passenger.getLuggageList().size()).sum();
        System.out.println("Passenger Count: " + passengerCount);
        System.out.println("Luggage Count: " + luggageCount);
    }

    public void searchByPassCount(int from) {
        searchByPassCount(from, Integer.MAX_VALUE);
    }

    public void searchByPassCount(int from, int to) {
        List<PassengerWagon> passengerWagonList = new ArrayList<>();
        for (PassengerWagon wagon : wagonList) {
            int size = wagon.getPassengerList().size();
            if (size >= from && size <= to) {
                passengerWagonList.add(wagon);
            }
        }
        passengerWagonList.forEach(System.out::println);
    }


    private List<PassengerWagon> getTrain() {
        PassengerWagon wagon1 = new PassVIPWagon("1");
        PassengerWagon wagon2 = new PassMiddleWagon("2");
        PassengerWagon wagon3 = new PassStandardWagon("3");
        PassengerWagon wagon4 = new PassVIPWagon("4");
        PassengerWagon wagon5 = new PassMiddleWagon("5");

        List<PassengerWagon> wagonList = new ArrayList<>();
        wagon1.setPassengerList(getPassenger(wagon1.getSeats()));
        wagon2.setPassengerList(getPassenger(wagon2.getSeats()));
        wagon3.setPassengerList(getPassenger(wagon3.getSeats()));
        wagon4.setPassengerList(getPassenger(wagon4.getSeats()));
        wagon5.setPassengerList(getPassenger(wagon5.getSeats()));
        wagonList.add(wagon1);
        wagonList.add(wagon2);
        wagonList.add(wagon3);
        wagonList.add(wagon4);
        wagonList.add(wagon5);
        return wagonList;
    }

    private List<Passenger> getPassenger(int seats) {
        seats = randomCount(seats);
        List<Passenger> passengerList = new ArrayList<>();
        for (int i = 0; i < seats; i++) {
            Passenger passenger = new Passenger();
            passenger.setLuggageList(getLuggage());
            passengerList.add(passenger);
        }
        return passengerList;
    }

    private List<Luggage> getLuggage() {
        int count = randomCount(3);
        if (count == 0) {
            return Collections.emptyList();
        }
        List<Luggage> luggageList = new ArrayList<>(count);
        for (int i = 0; i < count; i++) {
            luggageList.add(new Luggage());
        }
        return luggageList;
    }

    private int randomCount(int count) {
        return new Random().nextInt(count);
    }
}
