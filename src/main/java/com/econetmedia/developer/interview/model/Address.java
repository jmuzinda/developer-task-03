package com.econetmedia.developer.interview.model;

import java.io.Serializable;

/**
 * Created by jmuzinda on 10/25/17.
 */
public class Address implements Serializable {

    private String addressPart1;
    private String addressPart2;
    private String addressPart3;
    private String addressPart4;

    public String getAddressPart1() {
        return addressPart1;
    }

    public void setAddressPart1(String addressPart1) {
        this.addressPart1 = addressPart1;
    }

    public String getAddressPart2() {
        return addressPart2;
    }

    public void setAddressPart2(String addressPart2) {
        this.addressPart2 = addressPart2;
    }

    public String getAddressPart3() {
        return addressPart3;
    }

    public void setAddressPart3(String addressPart3) {
        this.addressPart3 = addressPart3;
    }

    public String getAddressPart4() {
        return addressPart4;
    }

    public void setAddressPart4(String addressPart4) {
        this.addressPart4 = addressPart4;
    }
}
