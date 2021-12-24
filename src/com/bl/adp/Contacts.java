package com.bl.adp;

public class Contacts {
    String firstname;
    String lastname;
    String address;
    String city;
    String state;
    String email;
    long phonenumber;
    int pincode;

    @Override
    public String toString() {
        return "Contacts [firstname=" + firstname + "lastname:"+lastname+"address:"+address+"city:"+city+
        "state:"+state+"email:"+email+"phonenumber:"+phonenumber+"pincode:"+pincode+"]";
    }
}
