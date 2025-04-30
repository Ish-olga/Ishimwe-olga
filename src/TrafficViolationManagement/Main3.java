package TrafficViolationManagement;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Main3 {
    public static <ViolationEntry> void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Driver Name: ");
        String name = sc.nextLine();

        System.out.print("Enter National ID (16 digits): ");
        String driverId = sc.nextLine();

        while (!driverId.matches("\\d{16}")) {
            System.out.println("Invalid National ID. Must be 16 digits.");
            System.out.print("Re-enter National ID: ");
            driverId = sc.nextLine();
        }

        System.out.print("Enter Vehicle Plate (e.g., RAB123D): ");
        String plate = sc.nextLine();
        while (!Pattern.matches("R[A-Z]{2}\\d{3}[A-Z]", plate)) {
            System.out.println(" Invalid Plate Number format.");
            System.out.print("Re-enter Plate Number: ");
            plate = sc.nextLine();
        }

        System.out.print("Enter Violation Type (SPEEDING, RED_LIGHT, NO_HELMET, DUI): ");
        String violation = sc.nextLine();



        FineAssessment assessment = new FineAssessment(driverId, name, 0.0, "UNPAID", plate, violation);
        assessment.assessFine();

        System.out.print("Do you want to pay the fine now? (yes/no): ");
        String payChoice = sc.nextLine();

        if (payChoice.equalsIgnoreCase("yes")) {
            FinePayment payment = new FinePayment(driverId, name, assessment.fineAmount, "UNPAID", plate, violation);
            payment.processPayment();
        } else {
            System.out.println("Payment is pending. Please pay later.");
        }




        sc.close();
    }


}





