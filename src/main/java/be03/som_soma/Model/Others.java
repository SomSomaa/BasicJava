package be03.som_soma.Model;

public class Others {
    private String insuranceType;
    private String couponCode;
    private String carRentalDetails;

    public Others(String insuranceType, String couponCode, String carRentalDetails) {
        this.insuranceType = insuranceType;
        this.couponCode = couponCode;
        this.carRentalDetails = carRentalDetails;
    }

    public String getInsuranceType() {
        return insuranceType;
    }

    public void setInsuranceType(String insuranceType) {
        this.insuranceType = insuranceType;
    }

    public String getCouponCode() {
        return couponCode;
    }

    public void setCouponCode(String couponCode) {
        this.couponCode = couponCode;
    }

    public String getCarRentalDetails() {
        return carRentalDetails;
    }

    public void setCarRentalDetails(String carRentalDetails) {
        this.carRentalDetails = carRentalDetails;
    }

}
