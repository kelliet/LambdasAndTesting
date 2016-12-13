package com.company;

import com.company.Shipping.*;
import com.company.Shipping.Package;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        //populating an arraylist of packages to demonstrate lambda expressions
        List<Package> packages = new ArrayList<>();
        packages.add(new Package(PackageType.FedexNextDay, false, true, "mary smith"));
        packages.add(new Package(PackageType.FedexSecondDay, false, false, "john doe"));
        packages.add(new Package(PackageType.FedexNextDay, true, true, "fred jones"));
        packages.add(new Package(PackageType.USPSGround, true, true, "Mike Stand"));

        //here we are showing how to use lambda expressions
        check(packages, new CheckCanBreak(), "can break ");
        check(packages, a -> a.canExplode(), " can explode ");


        //here we are going to check the price of a package
        System.out.println(checkPrice(25, PackageType.FedexNextDay));
        System.out.println(checkPrice(2, PackageType.USPSGround));





    }

    //our check method is called by a traditional call and a lambda
    private static void check(List<Package> packages, CheckAttribute checkAttribute, String value) {

        for (Package p : packages) {
            System.out.println("Package for " + p.getShipToName() + " " + value + " is " + checkAttribute.testAttribute(p));
        }
    }

    //our check method is called by a traditional call and a lambda
    private static double checkPrice(long weight, PackageType packageType) {

        return new Carrier().price(weight, packageType);

    }
}
