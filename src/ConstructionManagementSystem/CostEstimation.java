package ConstructionManagementSystem;

import java.text.DecimalFormat;

public class CostEstimation extends ConstructionMaterial {


    public CostEstimation(String contractorId, String contractorName, double materialBalance, double materialQuantity) {
        super(contractorId, contractorName, materialBalance, materialQuantity);
    }

    @Override
    public void estimateCost() {

        double costPerTon = 0;
        if (materialQuantity >= 5 && materialQuantity <= 15) {
            costPerTon = 200000;
        } else if (materialQuantity > 15) {
            costPerTon = 180000;
        } else {
            System.out.println("Error: Minimum of 5 tons required for cost estimation.");
            return;
        }

        double totalCost = materialQuantity * costPerTon;

        System.out.println("\n--- Cost Estimation ---");
        System.out.println("Contractor ID: " + contractorId);
        System.out.println("Contractor Name: " + contractorName);
        System.out.println("Quantity Used: " + materialQuantity + " tons");
        System.out.printf("Total Cost: Rp %, .2f\n", totalCost);

    }

    @Override
    public void receiveMaterial() {
    }

    @Override
    public void useMaterial() {

    }
}


