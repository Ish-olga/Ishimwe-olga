package HotelManagementSystem;

public class Billing extends HotelService {
    private static final int STANDARD_RATE = 50000;
    private static final int DELUXE_RATE = 80000;
    private static final int SUITE_RATE = 120000;
    private static double totalCost;



    public Billing(String guestId, String guestName, String roomStatus, String roomType, int stayDays) {
        super(guestId, guestName, roomStatus, roomType, stayDays);
    }




    @Override
    boolean bookroom() {
        System.out.println("Not available in billing service.");
        return false;

    }


    @Override
    boolean CheckoutGuest() {
        System.out.println("this operation is not available for billing service ");
        return false;
    }

    @Override
    void generalBill() {
        int totalcost = 0;
        String roomType = getRoomType();

        switch (roomType) {
            case "STANDARD":
                totalCost = getStayDays() * STANDARD_RATE;
                break;
            case "DELUXE":
                totalCost = getStayDays() * DELUXE_RATE;
                break;
            case "SUITE":
                totalCost = getStayDays() * SUITE_RATE;
                break;
            default:
                System.out.println("Error: Invalid room type.");
                return;
        }

        System.out.println("LEMIGO HOTEL BILL");
        System.out.println("Guest Name: " + getGuestName());
        System.out.println("Guest ID: " + getGuestId());
        System.out.println("Room Type: " + getRoomType());
        System.out.println("Days Stayed: " + getStayDays());
        System.out.println("Room Rate per Night: " + (roomType));
        System.out.println("Total Cost: " + (totalCost));
        System.out.println("================================");
    }


    }



