package HotelManagementSystem;

public class GuestCheckOut extends HotelService {

    public GuestCheckOut(String guestId, String guestName, String roomStatus, String roomType, int stayDays) {
        super(guestId, guestName, roomStatus, roomType, stayDays);
    }

    @Override
    boolean bookroom() {
        if (!roomStatus.equals("OCCUPIED")) {
            System.out.println("Not available in checkout service.");
            return false;


        }
        return false;
    }


    @Override
    boolean CheckoutGuest() {
        if (!roomStatus.equals("OCCUPIED")) {
            System.out.println("Error: Cannot checkout. Room is already available.");
            return false;
        }

        roomStatus = "AVAILABLE";
        System.out.println("Checkout successful for " + guestName + " (ID: " + guestId + ")");
        System.out.println("Room status changed to AVAILABLE");
        return true;

    }

    @Override
    void generalBill() {
        System.out.println("Billing operation not supported in GuestCheckout class");

    }
}


