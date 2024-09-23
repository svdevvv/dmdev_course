package com.dmdev.cs.homework.oopHM;

public class Apartment {
    private int apartmentIndex;
    private Room[] rooms;

    public Apartment(int apartmentIndex, Room[] rooms) {
        this.apartmentIndex = apartmentIndex;
        this.rooms = rooms;
    }

    public void print() {
        System.out.println("Номер квартиры: " + apartmentIndex + " Содержит комнат: " + rooms.length);
        for (Room room : rooms) {
            room.print();
        }
    }

    public int getApartmentIndex() {
        return apartmentIndex;
    }

    public void setApartmentIndex(int apartmentIndex) {
        this.apartmentIndex = apartmentIndex;
    }
}
