package com.dmdev.cs.homework.ifSwitchHM;

import java.util.Scanner;
//В переменной minutes лежит число от 0 до 59.
//        Написать функцию, которая принимает в качестве параметра значение переменной minutes и выводит на консоль
//в какую четверть часа попадает это число (в первую, вторую, третью или четвертую).
//
//Протестировать функцию в main.

public class Task1Switch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int minutes = scanner.nextInt();
        System.out.println(getQuarter(minutes));
    }

    public static int getQuarter(int minutes){

        switch (minutes/15) {
//            case 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 -> System.out.println(minutes + " = " + " first quarter");
//            case 16,17,18,19,20,21,22,23,24,25,26,27,28,29,30 -> System.out.println(minutes + " = " + " second quarter");
//            case 31,32,33,34,35,36,37,38,39,40,41,42,43,44,45 -> System.out.println(minutes + " = " + " third quarter");
//            case 46,47,48,49,50,51,52,53,54,55,56,57,58,59 -> System.out.println(minutes + " = " + "fourth quarter");
            case 0 -> System.out.println(minutes + " = " + " first quarter");
            case 1 -> System.out.println(minutes + " = " + " second quarter");
            case 2 -> System.out.println(minutes + " = " + " third quarter");
            case 3 -> System.out.println(minutes + " = " + " fourth quarter");
            default -> System.out.println("Invalid value");
        }
        return minutes;
    }
}
