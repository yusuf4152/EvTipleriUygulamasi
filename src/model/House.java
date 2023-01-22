package model;

import model.BaseHome;

public class House extends BaseHome {
    public House(Integer price, Integer squareMeters, Integer numberOfRooms, Integer numberOfHalls) {
        super(price, squareMeters, numberOfRooms, numberOfHalls);
    }

    @Override
    public String toString() {
        return "House"+super.toString();
    }
}
