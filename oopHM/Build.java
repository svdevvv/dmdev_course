package com.dmdev.cs.homework.oopHM;

public class Build {
    private int buildIndex = 0;
    private Floor[] floors;

    public Build(int buildIndex, Floor[] floors) {
        this.buildIndex = buildIndex;
        this.floors = floors;
    }

    public void print() {
        System.out.println("Дом номер: " + buildIndex + " Этажей в доме: " + floors.length);
        for (Floor floor : floors) {
            floor.print();
        }
    }


    public int getBuildIndex() {
        return buildIndex;
    }

    public void setBuildIndex(int buildIndex) {
        this.buildIndex = buildIndex;
    }

    public Floor[] getFloors() {
        return floors;
    }

    public void setFloors(Floor[] floors) {
        this.floors = floors;
    }
}
