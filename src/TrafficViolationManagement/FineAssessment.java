package TrafficViolationManagement;

public class FineAssessment extends TrafficRecord{

    public FineAssessment(String driverId, String driverName, double fineAmount, String paymentStatus, String vehiclePlate, String violationType) {
        super(driverId, driverName, fineAmount, paymentStatus, vehiclePlate, violationType);
    }

    @Override
    void assessFine() {
        switch (violationType.toUpperCase()) {
            case "SPEEDING":
                fineAmount = 50000;
                break;
            case "RED_LIGHT":
                fineAmount = 80000;
                break;
            case "NO_HELMET":
                fineAmount = 30000;
                break;
            case "DUI":
                fineAmount = 150000;
                break;
            default:
                System.out.println(" Unknown violation type.");
                return;
        }



    }

    @Override
    void recordViolation() {

    }

    @Override
    void processPayment() {
        return;

    }
}
