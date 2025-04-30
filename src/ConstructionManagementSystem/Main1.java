package ConstructionManagementSystem;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println(" Site Construction Management System ");
        System.out.print("Enter Contractor ID: ");
        String contractorId = sc.nextLine();

        System.out.print("Enter Contractor Name: ");
        String contractorName = sc.nextLine();

        System.out.print("Enter Material Quantity (tons): ");
        double quantity = sc.nextDouble();

        System.out.print("Enter Current Material Balance (tons): ");
        double balance = sc.nextDouble();

        double Balance = 5.0;

        System.out.println("\n--- Material Delivery ---");
        MaterialDelivery delivery = new MaterialDelivery(contractorId, contractorName, quantity, balance);

        delivery.receiveMaterial();
        balance = delivery.getMaterialBalance(); // Update balance

        System.out.println("--- Material Usage ---");
        MaterialUsage usage = new MaterialUsage (contractorId, contractorName, quantity, balance);
        usage.useMaterial();
        balance = usage.getMaterialBalance(); // Update balance again

        System.out.println("--- Cost Estimation ---");
        CostEstimation estimation = new CostEstimation(contractorId,contractorName, quantity, balance);
        estimation.estimateCost();

        sc.close();
    }
}


