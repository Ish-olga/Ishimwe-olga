package HotelManagementSystem;

public class RoomBooking extends HotelService {

    public RoomBooking(String guestId, String guestName, String roomStatus, String roomType, int stayDays) {
        super(guestId, guestName, roomStatus, roomType, stayDays);
    }

    @Override
    boolean bookroom() {
        if (stayDays < 1 || stayDays > 30) {
            System.out.println("Booking failed: Stay duration must be between 1 and 30 days.");
        } else if (!roomStatus.equals("AVAILABLE")) {
            System.out.println("Booking failed: Room is not available.");
        } else {
            roomStatus = "OCCUPIED";
            System.out.println("Booking successful for " + guestName + ". Room status set to OCCUPIED.");
        }
        return false;
    }

        @Override
        boolean CheckoutGuest () {
            System.out.println("Checkout operation not supported in RoomBooking class");
            return false;
        }


        @Override
        void generalBill () {
            System.out.println("Billing operation not supported in RoomBooking class");

        }
    }




