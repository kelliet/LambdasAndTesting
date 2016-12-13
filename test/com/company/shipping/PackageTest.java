package com.company.shipping;

import com.company.Shipping.Package;
import com.company.Shipping.PackageType;
import org.junit.Assert;
import org.junit.Test;


/**
 * Created by kellie on 12/12/16.
 */
public class PackageTest {

    @Test
    public void CarrierPriceTest() {

        System.out.println("in carrierPriceTest ");

        Package p = new Package(PackageType.FedexNextDay);

        System.out.println(p.getType());
        //valid method
        //price is correct
        //given, when, then
        Assert.assertEquals(PackageType.FedexNextDay, p.getType());
        Assert.assertEquals(PackageType.FedexNextDay.getMaxWeight(), 25.0, 15.0);
        Assert.assertEquals(PackageType.USPSGround.getMaxWeight(), 30, 25);

    }
}
