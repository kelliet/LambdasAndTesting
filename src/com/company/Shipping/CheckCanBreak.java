package com.company.Shipping;

/**
 * Created by kellie on 12/9/16.
 */
public class CheckCanBreak implements CheckAttribute {

    public boolean testAttribute(Package aPackage) {
        return aPackage.canBreak();
    }
}
