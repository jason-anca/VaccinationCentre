package com.example.vaccinationmanagementsystem;

public class VaccinationCentre{
    VaccinationCentre nextVC;
    Booth headBooth;
    String name, eircode, phone, address;
    int parkingSpaces;

    //Getters
    public String getName() {
        return name;
    }

    public String getEircode() {
        return eircode;
    }

    @Override
    public String toString() {
        return "VaccinationCentre{" +
              //  "nextVC=" + nextVC +
                ", name='" + name + '\'' +
                ", eircode='" + eircode + '\'' +
                ", phone='" + phone + '\'' +
                ", address='" + address + '\'' +
                ", parkingSpaces=" + parkingSpaces +
                '}';
    }

    public String getPhone() {
        return phone;
    }

    public String getAddress() {
        return address;
    }

    public int getParkingSpaces() {
        return parkingSpaces;
    }

    //Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setEircode(String eircode) {
        this.eircode = eircode;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setParkingSpaces(int parkingSpaces) {
        this.parkingSpaces = parkingSpaces;
    }

    public void addElementBooth(Booth booth){
        booth.nextBooth = headBooth;
        headBooth = booth;
    }
    public String printListBooth(){
        String list = "";
        Booth current = headBooth;
        while(current != null){
            list = list + current + "\n";
            current = current.nextBooth;
        }
        return list;
    }
}
