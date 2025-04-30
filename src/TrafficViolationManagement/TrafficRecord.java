package TrafficViolationManagement;

import javax.swing.plaf.synth.SynthOptionPaneUI;

abstract public class TrafficRecord {
    protected String driverId;
    protected String driverName;
    protected String vehiclePlate;
    protected String violationType;
    protected double fineAmount;
    protected String paymentStatus;

    public TrafficRecord(String driverId, String driverName, double fineAmount, String paymentStatus, String vehiclePlate, String violationType) {

        if (!driverId.matches("\\d+")) {
            System.out.println("Driver ID must contain only numbers.");
        }
        if (!driverName.matches("[a-zA-Z\\s]+")) {
            System.out.println("Driver name must contain only letters and spaces.");
        }




        this.driverId = driverId;
        this.driverName = driverName;
        this.fineAmount = fineAmount;
        this.paymentStatus = paymentStatus;
        this.vehiclePlate = vehiclePlate;
        this.violationType = violationType;
    }

    abstract void recordViolation();
    abstract void assessFine();
    abstract void processPayment();

}
