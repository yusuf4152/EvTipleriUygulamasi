public class Main {
    public static void main(String[] args) {
        Service service = new Service();
        System.out.println(service.getHousesValues());
        System.out.println(service.getVillasValues());
        System.out.println(service.getSummeriesValues());
        System.out.println(service.getHousesTotalPrice());
        System.out.println(service.getVillasTotalPrice());
        System.out.println(service.getSummeryTotalPrice());
        System.out.println(service.getTotalPriceForAll());
        System.out.println(service.getAverageSquareMeterForHouses());
        System.out.println(service.getAverageSquareMeterForVillas());
        System.out.println(service.getAverageSquareMeterForSummeries());
        System.out.println(service.getAverageSquareMeterForAll());
        System.out.println(service.getByNumberOfRoomAndHall(4,3));
    }
}