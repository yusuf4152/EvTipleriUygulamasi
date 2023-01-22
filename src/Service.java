import model.BaseHome;
import model.House;
import model.Summery;
import model.Villa;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Service {
    private final Creation creation = new Creation();
    private final List<House> houseList = creation.getHouseList();

    private final List<Villa> villaList = creation.getVillaList();

    private final List<Summery> summeryList = creation.getSummeryList();
    private int houseTotalSquareMeter = 0;
    private int villaTotalSquareMeter = 0;
    private int summeryTotalSquareMeter = 0;

    public List<String> getHousesValues() {
        return houseList.stream().map(House::toString).collect(Collectors.toList());
    }

    public List<String> getVillasValues() {
        return villaList.stream().map(Villa::toString).collect(Collectors.toList());
    }

    public List<String> getSummeriesValues() {
        return summeryList.stream().map(Summery::toString).collect(Collectors.toList());
    }

    public int getHousesTotalPrice() {
        return houseList.stream().mapToInt(BaseHome::getPrice).sum();
    }

    public int getVillasTotalPrice() {
        return villaList.stream().mapToInt(BaseHome::getPrice).sum();
    }

    public int getSummeryTotalPrice() {
        return summeryList.stream().mapToInt(BaseHome::getPrice).sum();
    }

    public int getTotalPriceForAll() {
        return getSummeryTotalPrice() + getHousesTotalPrice() + getVillasTotalPrice();
    }

    public int getAverageSquareMeterForHouses() {
        houseTotalSquareMeter = houseList.stream().mapToInt(BaseHome::getSquareMeters).sum();
        return houseList.stream().mapToInt(BaseHome::getSquareMeters).sum() / houseList.size();
    }

    public int getAverageSquareMeterForVillas() {
        villaTotalSquareMeter = villaList.stream().mapToInt(BaseHome::getSquareMeters).sum();
        return villaList.stream().mapToInt(BaseHome::getSquareMeters).sum() / houseList.size();
    }

    public int getAverageSquareMeterForSummeries() {
        summeryTotalSquareMeter = summeryList.stream().mapToInt(BaseHome::getSquareMeters).sum();
        return summeryList.stream().mapToInt(BaseHome::getSquareMeters).sum() / houseList.size();
    }

    public int getAverageSquareMeterForAll() {
        int sizes = houseList.size() + villaList.size() + summeryList.size();
        int total = houseTotalSquareMeter + villaTotalSquareMeter + summeryTotalSquareMeter;
        return total / sizes;
    }

    public List<String> getByNumberOfRoomAndHall(int numberOfRoom, int numberOfHall) {
        List<String> selectedHomes = new ArrayList<>();
        houseList.stream()
                .filter(house -> house.getNumberOfRooms() == numberOfRoom && house.getNumberOfHalls() == numberOfHall)
                .map(House::toString)
                .forEach(selectedHomes::add);
        summeryList.stream()
                .filter(summery -> summery.getNumberOfRooms() == numberOfRoom && summery.getNumberOfHalls() == numberOfHall)
                .map(Summery::toString)
                .forEach(selectedHomes::add);
        villaList.stream()
                .filter(villa -> villa.getNumberOfRooms() == numberOfRoom && villa.getNumberOfHalls() == numberOfHall)
                .map(Villa::toString)
                .forEach(selectedHomes::add);
        return selectedHomes;
    }
}
