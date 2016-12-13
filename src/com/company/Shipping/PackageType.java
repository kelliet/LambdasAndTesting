package com.company.Shipping;

/**
 * Created by kellie on 12/12/16.
 */
public enum PackageType {
    FedexNextDay("fedex", "next day", 10.0),
    FedexSecondDay("fedex", "second day", 20.0),
    USPSGround("usps", "ground", 55.0),
    USPSParcel("usps", "parcel", 2.0);

    private String shippingMethod;
    private String carrier;
    private double maxWeight;

    public double getMaxWeight() {
        return maxWeight;
    }


    PackageType(String carrier, String shippingMethod, double maxWeight) {
        this.shippingMethod = shippingMethod;
        this.carrier = carrier;
        this.maxWeight = maxWeight;
    }

    public String getShippingMethod() {
        return shippingMethod;
    }

    public String getCarrier() {
        return carrier;
    }
}
