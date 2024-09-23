package com.dmdev.cs.homework.oopHM;

public class Floor {
    private int floorIndex = 0;
    private Apartment[] apartments;

    public Floor(int floorIndex, Apartment[] apartments) {
        this.floorIndex = floorIndex;
        this.apartments = apartments;
    }

    public void print() {
        System.out.println("Этаж: " + floorIndex + " Квартир на этаже: " + apartments.length);
        for (Apartment apartment : apartments) {
            apartment.print();
        }

    }

    public int getFloorIndex() {
        return floorIndex;
    }

    public void setFloorIndex(int floorIndex) {
        this.floorIndex = floorIndex;
    }

    public Apartment[] getApartments() {
        return apartments;
    }

    public void setApartments(Apartment[] apartments) {
        this.apartments = apartments;
    }
}
