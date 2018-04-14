package jp.jopeg.model;

public class ProductType {

    public boolean isInsurance;

    public ProductType(boolean isInsurance) {
        this.isInsurance = isInsurance;
    }

    public boolean getInsurance() {
        return isInsurance;
    }

    public void setInsurance(boolean insurance) {
        isInsurance = insurance;
    }
}
