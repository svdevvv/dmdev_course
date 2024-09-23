package com.dmdev.cs.homework.oopHM;

public class BuildRunner {
    public static void main(String[] args) {
        Room room1 = new Room(true);
        Room room2 = new Room(false);
        Room room3 = new Room(false);
        Room room4 = new Room(true);
        Room room5 = new Room(true);
        Room room6 = new Room(true);

        Apartment apartment1 = new Apartment(1, new Room[]{room1, room2});
        Apartment apartment2 = new Apartment(2, new Room[]{room2, room3});
        Apartment apartment3 = new Apartment(3, new Room[]{room2, room4});
        Apartment apartment4 = new Apartment(4, new Room[]{room1, room4});
        Apartment apartment5 = new Apartment(5, new Room[]{room2, room3, room5});
        Apartment apartment6 = new Apartment(6, new Room[]{room2, room4, room6});

        Floor floor1 = new Floor(1, new Apartment[]{apartment1, apartment2, apartment3});
        Floor floor2 = new Floor(2, new Apartment[]{apartment4, apartment5});
        Floor floor3 = new Floor(3, new Apartment[]{apartment6});

        Build build = new Build(1, new Floor[]{floor1, floor2, floor3});

        build.print();
    }
}
