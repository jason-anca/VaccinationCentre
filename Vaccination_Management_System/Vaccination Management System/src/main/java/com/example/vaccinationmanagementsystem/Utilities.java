package com.example.vaccinationmanagementsystem;

public class Utilities {

    //todo Finish validation
    public static boolean validPPS(String pps) {
        if (pps != null && pps.length() == 9) {
            return (pps.matches("[0-9]{7}[a-zA-Z]{2}"));
        } else {
            return false;
        }
    }
    public static boolean validEmail(String email) {
        return (email.contains("@") && email.contains("."));
    }

    public static String validPhoneNumber(String number){
        while(number.length() <= 15 && number.length() >= 11)
            return number;
        return "Phone number must be between 11 and 15 numbers long";
    }

    public void validInt(int i){

    }

    //https://stackoverflow.com/questions/33391412/validation-for-irish-eircode
    public boolean validEircode(String eircode){
        while (eircode != null && eircode.length() <= 8 && eircode.length() <= 7){
            return (eircode.matches("(?:^[AC-FHKNPRTV-Y][0-9]{2}|D6W)[ -]?[0-9AC-FHKNPRTV-Y]{4}$"));
        }
        return false;
    }

    public String validFirstName(String firstName){
        while (firstName.length() >= 15){
            return firstName;
        }
        return "Name cannot be longer than 20 characters";
    }

    public String validLastName(String lastName){
        while (lastName.length() >= 20){
            return lastName;
        }
        return "Name cannot be longer than 20 characters";
    }



}
