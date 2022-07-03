package task08.model.parent;

import task08.model.Passenger;

import java.util.List;

public abstract class PassengerWagon extends Wagon {

    private final int level;
    private final int seats;
    private List<Passenger> passengerList;

    public PassengerWagon(String number, int level, int seats) {
        super(number);
        this.level = level;
        this.seats = seats;
    }

    public int getLevel() {
        return level;
    }

    public int getSeats() {
        return seats;
    }

    public List<Passenger> getPassengerList() {
        return passengerList;
    }

    public void setPassengerList(List<Passenger> passengerList) {
        this.passengerList = passengerList;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", level = " + level +
                ", seats = " + seats +
                ", count = " + passengerList.size() +
                " , luggage = " + passengerList
                .stream()
                .mapToInt(pass -> pass.getLuggageList().size()).sum();
    }
}
