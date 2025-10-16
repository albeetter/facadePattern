package facadePattern;

public class Valet implements HotelService {
    public void pickUpVehicle(String plateNumber) {
        System.out.println("Valet is picking up vehicle with plate number: " + plateNumber);
    }

    @Override
    public void performService() {
        System.out.println("Valet service is being performed.");
    }
}
