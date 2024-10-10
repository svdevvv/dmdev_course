package com.dmdev.cs.homework.collectionsHM.Chat;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * Дан список чатов с предыдущего задания, только вместо поля
 * “количество пользователей” будет список объектов
 * типа Пользователь, который имеет 3 поля: id (целочисленный идентификатор), имя и возраст.
 * Задача:
 * - Преобразовать список чатов в один список пользователей всех чатов, возраст которых больше 18 лет
 * - С помощью итератора посчитать средний возраст всех оставшихся пользователей.
 */

public class ChatListWithUsersRunner {
    public static void main(String[] args) {
        List<User> uniStudentsJavaDevs = Arrays.asList(
                new User(4, "Nikolay", 17),
                new User(3, "Nikola", 17)
        );
        List<User> internJavaDevs = Arrays.asList(
                new User(1, "Nikita", 15),
                new User(2, "Petya", 19)
        );
        List<User> juniorJavaDevs = Arrays.asList(
                new User(1, "Sergey", 18),
                new User(2, "Arnold", 29)
        );
        List<User> middleJavaDevs = Arrays.asList(
                new User(1, "Andrey", 17),
                new User(2, "Valdemar", 21)
        );
        List<User> seniorJavaDevs = Arrays.asList(
                new User(1, "Pavel", 32),
                new User(2, "Denis", 28)
        );
        List<User> teamLeads = Arrays.asList(
                new User(5, "Bill", 49),
                new User(7, "Jeff", 52)
        );

        List<ChatListWithUsers> list = Arrays.asList(
                new ChatListWithUsers("JavaDevsInterns", internJavaDevs),
                new ChatListWithUsers("JavaDevsUniStudents", uniStudentsJavaDevs),
                new ChatListWithUsers("JavaDevsJuniors", juniorJavaDevs),
                new ChatListWithUsers("JavaDevsMiddles", middleJavaDevs),
                new ChatListWithUsers("JavaDevsSeniors", seniorJavaDevs),
                new ChatListWithUsers("JavaTeamLeads", teamLeads)
        );
        List<User> adultList = createAdultList(list);
        for (User user : adultList) {
            System.out.println(user);
        }
        double avga = averageAge(adultList);
        System.out.println("Средний возраст людей старше 18 = " + avga);

    }

    public static List<User> createAdultList(List<ChatListWithUsers> list) {
        ArrayList<User> users = new ArrayList<>();
        for (ChatListWithUsers chatList : list) {
            for (User user : chatList.getUsers()) {
                if (user.getAge() > 18) {
                    users.add(user);
                }
            }
        }

        return users;
    }

    public static double averageAge(List<User> list) {
        if(list.isEmpty()){
            return 0;
        }
        double totalAge = 0;
        double count = 0;
        Iterator<User> iterator = list.iterator();
        while (iterator.hasNext()){
            User next = iterator.next();
            totalAge +=next.getAge();
            count++;
        }
        return totalAge / count;
    }
}
