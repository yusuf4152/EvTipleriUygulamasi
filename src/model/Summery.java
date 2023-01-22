package model;

import model.BaseHome;

public class Summery extends BaseHome {
    public Summery(Integer price, Integer squareMeters, Integer numberOfRooms, Integer numberOfHalls) {
        super(price, squareMeters, numberOfRooms, numberOfHalls);
    }

    @Override
    public String toString() {
        return "Summery"+super.toString();
    }
}
