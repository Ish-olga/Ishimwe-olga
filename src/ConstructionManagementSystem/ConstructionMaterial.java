package ConstructionManagementSystem;

abstract public class ConstructionMaterial {
    protected String contractorId;
    protected String contractorName;
    protected double materialQuantity;
    protected double materialBalance;



    public ConstructionMaterial(String contractorId, String contractorName, double materialBalance, double materialQuantity) {

        if (contractorId == null || contractorId.length() != 16) {
            System.out.println("Contractor ID must be exactly 16 characters.");
        }

        if (contractorName == null || !contractorName.matches("[a-zA-Z ]+")) {
            System.out.println("Contractor name must contain only letters and spaces.");
        }

        if (materialQuantity < 0 || materialBalance < 0) {
            System.out.println("Material quantity and balance must be non-negative.");
        }





        this.contractorId = contractorId;
        this.contractorName = contractorName;
        this.materialBalance = materialBalance;
        this.materialQuantity = materialQuantity;

    }

    public String getContractorId() {
        return contractorId;
    }

    public void setContractorId(String contractorId) {
        this.contractorId = contractorId;
    }

    public String getContractorName() {
        return contractorName;
    }

    public void setContractorName(String contractorName) {
        this.contractorName = contractorName;
    }

    public double getMaterialBalance() {
        return materialBalance;
    }

    public void setMaterialBalance(double materialBalance) {
        this.materialBalance = materialBalance;
    }

    public double getMaterialQuantity() {
        return materialQuantity;
    }

    public void setMaterialQuantity(double materialQuantity) {
        this.materialQuantity = materialQuantity;
    }

    public abstract void receiveMaterial();
    public abstract void useMaterial();
    public abstract void estimateCost();


}




