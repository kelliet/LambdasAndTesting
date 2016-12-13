package com.company.Shipping;

/**
 * Created by kellie on 12/9/16.
 */
public class Package {

    private String shipToName;
    private boolean canBreak;
    private boolean canExplode;

    private PackageType type;

    public Package(PackageType type) {
        this.type = type;
        this.canBreak = false;
        this.canExplode = false;
    }

    public Package(PackageType type, boolean fragile, boolean explode, String shipToName) {

        this.type = type;
        this.canBreak = fragile;
        this.canExplode = explode;
        this.shipToName = shipToName;

    }

    public boolean canBreak() { return canBreak; }
    public boolean canExplode() { return canExplode; }
    public String getShipToName() { return shipToName; }

    public PackageType getType() {return type;}



}
