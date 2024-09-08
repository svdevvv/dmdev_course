package com.dmdev.cs.homework;

import java.util.Scanner;

//В переменной minutes лежит число от 0 до 59.
//        Написать функцию, которая принимает в качестве параметра значение переменной minutes и выводит на консоль
//в какую четверть часа попадает это число (в первую, вторую, третью или четвертую).
//
//Протестировать функцию в main.

public class Task1If {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int minutes = scanner.nextInt();
        System.out.println(getQuarter(minutes));
    }

    public static int getQuarter(int minutes) {
        if (minutes <= 15) {
            System.out.println(minutes + " = " + " first quarter ");
        } else if (minutes <= 30 && minutes > 15) {
            System.out.println(minutes + " = " + " second quarter ");
        }else if(minutes > 30 && minutes <=45){
            System.out.println(minutes + " = " + " third quarter ");
        }else if(minutes > 45 && minutes <=59){
            System.out.println(minutes + " = " + " fourth quarter");
        }else {
            System.out.println("Invalid value");
        }

        return minutes;
    }

}
