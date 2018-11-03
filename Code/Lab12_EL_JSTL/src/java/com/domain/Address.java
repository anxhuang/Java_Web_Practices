package com.domain;

import java.io.Serializable;

//implements Serializable for JavaBeans
public class Address implements Serializable {

    private String address1;
    private String address2;
    private String city;
    private String region;
    private String postCode;

    public Address() {
    }

    public Address(String address1, String address2, String city, String region, String postCode) {
        this.address1 = address1;
        this.address2 = address2;
        this.city = city;
        this.region = region;
        this.postCode = postCode;
    }

    public String getAddress1() {
        return address1;
    }

    public String getAddress2() {
        return address2;
    }

    public String getCity() {
        return city;
    }

    public String getRegion() {
        return region;
    }

    public String getPostCode() {
        return postCode;
    }

    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

}
