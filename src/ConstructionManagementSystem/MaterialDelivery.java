package ConstructionManagementSystem;

public class MaterialDelivery extends ConstructionMaterial {

    public MaterialDelivery(String contractorId, String contractorName, double materialBalance, double materialQuantity) {
        super(contractorId, contractorName, materialBalance, materialQuantity);
    }


    @Override
    public void receiveMaterial() {
        if (materialQuantity >= 1 && materialQuantity <= 10) {
            materialBalance += materialQuantity;
            System.out.println("Material delivered successfully. Updated balance: " + materialBalance + " tons.");
        } else {
            System.out.println("Error: Delivery quantity must be between 1 and 10 tons.");
        }
    }


    @Override
    public void useMaterial() {

    }

    @Override
    public void estimateCost() {

    }
}





