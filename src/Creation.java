import model.House;
import model.Summery;
import model.Villa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Creation {
    private final List<House> houses = new ArrayList<>();
    private final List<Villa> villas = new ArrayList<>();
    private final List<Summery> summeries = new ArrayList<>();
    private final House house1 = new House(200000, 120, 2, 1);
    private final House house2 = new House(150000, 110, 2, 1);
    private final House house3 = new House(250000, 130, 2, 1);
    private final Villa villa1 = new Villa(2000000, 220, 3, 2);
    private final Villa villa2 = new Villa(2500000, 270, 3, 2);
    private final Villa villa3 = new Villa(3000000, 320, 4, 3);
    private final Summery summery1 = new Summery(201000, 220, 3, 2);
    private final Summery summery2 = new Summery(202000, 230, 3, 2);
    private final Summery summery3 = new Summery(203000, 240, 3, 2);

    //olusturulan evleri döner
    public List<House> getHouseList() {
        houses.addAll(Arrays.asList(house1, house2, house3));
        return houses;
    }

    //olusturulan villaları döner
    public List<Villa> getVillaList() {
        villas.addAll(Arrays.asList(villa1, villa2, villa3));
        return villas;
    }


    //olusturulan yazlıkları döner
    public List<Summery> getSummeryList() {
        summeries.addAll(Arrays.asList(summery1, summery2, summery3));
        return summeries;
    }
}
