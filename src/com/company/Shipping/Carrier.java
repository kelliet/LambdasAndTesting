package com.company.Shipping;


public class Carrier {

   public double price(long weight, PackageType type) {

       double price = 0;
        if(type.equals(PackageType.FedexNextDay) && weight < 20){
            price = 8.00;
        } else if(type.equals(PackageType.USPSGround)){
            price = 5.00;
        } else {
            price = 14.00;
        }

        return price;
    }
}
