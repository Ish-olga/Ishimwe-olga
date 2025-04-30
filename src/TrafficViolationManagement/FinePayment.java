package TrafficViolationManagement;

public class FinePayment extends TrafficRecord{

    public FinePayment(String driverId, String driverName, double fineAmount, String paymentStatus, String vehiclePlate, String violationType) {
        super(driverId, driverName, fineAmount, paymentStatus, vehiclePlate, violationType);
    }

    @Override
    void assessFine() {

    }

    @Override
    void recordViolation() {

    }

    @Override
    void processPayment() {
        if ("PAID".equalsIgnoreCase(paymentStatus)) {
            System.out.println(" Payment has already been made for this violation.");
        } else {
            paymentStatus = "PAID";
            System.out.println("\n✅ Payment Successful!");
            System.out.println("Receipt:");
            System.out.println("Driver Name    : " + driverName);
            System.out.println("Vehicle Plate  : " + vehiclePlate);
            System.out.printf("Amount Paid    : RWF %,d\n", (int) fineAmount);
            System.out.println("Payment Status : " + paymentStatus);
        }
    }


}






