package com.dmdev.cs.homework;

import java.util.Scanner;

//Даны два прямоугольных треугольника.
//Каждый из них задается двумя целочисленными переменными a и b - стороны треугольника.
//        Написать код, в котором вычисляется площадь каждого треугольника и затем эти площади сравниваются друг с другом.
//
//Для этого понадобится написать 2 функции.
//        Первая: по двум сторонам прямоугольного треугольника возвращает его площадь.
//Вторая: сравнивает переданные площади двух треугольников и выводит на консоль первый треугольник больше, меньше или равен второму.
//        Учитывать, что площадь может быть вещественным числом.



public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a1 = scanner.nextDouble();
        double b1 = scanner.nextDouble();
        double rectangle1 = getSquare(a1,b1);
        System.out.println("Площадь первого прямоугольника: " + rectangle1);
        double a2 = scanner.nextDouble();
        double b2 = scanner.nextDouble();
        double rectangle2 = getSquare(a2,b2);
        System.out.println("Площадь второго прямоугольника: " + rectangle2);
        System.out.println("Первый прямоугольник = " + rectangle1 + ", "
                + "Второй прямоугольник = " + rectangle2 + ". "
                + "Большим прямоугольником являеться прямоугольник с площадью = "
                + rectangleCompare(rectangle1,rectangle2));


    }
    public static double getSquare(double a, double b){
        return a*b;
    }

    public static double rectangleCompare(double a, double b){
        return a > b ? a : b;
    }

}
