package com.dmdev.cs.homework.oopHM;

public class Room {
    private boolean isWalkThrough;

    public Room(boolean isWalkThrough) {
        this.isWalkThrough = isWalkThrough;
    }

    public void print() {
        if (isWalkThrough == true) {

            System.out.println("Комната проходная");
        }
    }
}
