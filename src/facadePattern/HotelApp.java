package facadePattern;

public class HotelApp {
    public static void main(String[] args) {
        FrontDesk frontDesk = new FrontDesk();

        System.out.println("=== Welcome to the Hotel Management System ===");

        checkIn(frontDesk);
    }

    public static void checkIn(FrontDesk frontDesk) {
        
        String guestName = "Mr. Kim";
        String plateNumber = "NEU-1025";
        int roomNumber = 405;
        int numberOfCarts = 2;

        System.out.println("\nGuest Check-In Details:");
        System.out.println("Guest Name: " + guestName);
        System.out.println("Vehicle Plate: " + plateNumber);
        System.out.println("Room Number: " + roomNumber);
        System.out.println("Requested Carts: " + numberOfCarts);

        System.out.println("\n=== Processing Services ===");
        frontDesk.requestValet(plateNumber);
        frontDesk.requestCleaning(roomNumber);
        frontDesk.requestCart(numberOfCarts);

        System.out.println("\nCheck-in process completed for " + guestName + ". Enjoy your stay!");
    }
}
