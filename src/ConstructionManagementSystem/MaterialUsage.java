package ConstructionManagementSystem;

public class MaterialUsage extends ConstructionMaterial {

    public MaterialUsage(String contractorId, String contractorName, double materialBalance, double materialQuantity) {
        super(contractorId, contractorName, materialBalance, materialQuantity);
    }

    @Override
    public void estimateCost() {

    }

    @Override
    public void receiveMaterial() {

    }

    @Override
    public void useMaterial() {
        if (materialBalance - materialQuantity >= 2) {
            materialBalance -= materialQuantity;
            System.out.println("Material used successfully! Remaining balance: " + materialBalance + " tons");
        } else {
            System.out.println("Insufficient materials. Minimum 2 tons must remain after usage.");
        }
    }

    }







