package TrafficViolationManagement;


public class ViolationEntry extends TrafficRecord {
    String allowedViolations;
    String ViolationEntry;




    public ViolationEntry(String driverId, String driverName, double fineAmount, String paymentStatus, String vehiclePlate, String violationType, String isValidViolation) {
        super(driverId, driverName, fineAmount, paymentStatus, vehiclePlate, violationType);

    }

    public ViolationEntry(String driverId, String driverName, double fineAmount, String paymentStatus, String vehiclePlate, String violationType) {
        super(driverId, driverName, fineAmount, paymentStatus, vehiclePlate, violationType);
    }

    private boolean isValidViolation(String violation) {
        return allowedViolations.contains(violation.toUpperCase());
    }


    @Override
    void assessFine() {

    }

    @Override
    void recordViolation() {
        if (isValidViolation(violationType)) {
            System.out.println(" Invalid violation type: " + violationType);
            System.out.println("Allowed types: " + allowedViolations);
            return;
        }

        paymentStatus = "UNPAID";

        System.out.println(" Violation Recorded Successfully!");
        System.out.println("Driver Name   : " + driverName);
        System.out.println("Driver ID     : " + driverId);
        System.out.println("Vehicle Plate : " + vehiclePlate);
        System.out.println("Violation Type: " + violationType.toUpperCase());
        System.out.println("Payment Status: " + paymentStatus);
    }


    @Override
    public void processPayment() {
        return;

    }
}

