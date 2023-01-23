public class Main {
    public static void main(String[] args) {
        Service service = new Service();
        System.out.println(service.getHousesValues() + " tüm evlerin bilgileri");
        System.out.println(service.getVillasValues() + " tüm villaların bilgileri");
        System.out.println(service.getSummeriesValues() + " tüm yazlıkların bilgileri ");
        System.out.println(service.getHousesTotalPrice() + " evlerin toplam fiyatı");
        System.out.println(service.getVillasTotalPrice() + " villaların toplam fiyatı");
        System.out.println(service.getSummeryTotalPrice() + " yazlıkların toplam fiyatı");
        System.out.println(service.getTotalPriceForAll() + " tüm tipteki evlerin toplam fiyatı");
        System.out.println(service.getAverageSquareMeterForHouses() + " evlerin ortalama metrekaresi");
        System.out.println(service.getAverageSquareMeterForVillas() + " villaların ortalama metrekaresi");
        System.out.println(service.getAverageSquareMeterForSummeries() + " yazlıkların ortalama metrekaresi");
        System.out.println(service.getAverageSquareMeterForAll() + " tüm tipteki evlerin ortalama metrekaresi");
        System.out.println(service.getByNumberOfRoomAndHall(4, 3) + " tüm tipteki evlerin oda ve salon sayısına göre getirilmesi");
    }
}