package model;
public class Villa extends BaseHome {
    public Villa(Integer price, Integer squareMeters, Integer numberOfRooms, Integer numberOfHalls) {
        super(price, squareMeters, numberOfRooms, numberOfHalls);
    }

    @Override
    public String toString() {
        return "Villa"+super.toString();
    }
}
