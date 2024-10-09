package com.dmdev.cs.homework.collectionsHM.Chat;

import java.util.*;

/**
 * Дан список чатов.
 * Каждый чат состоит из двух полей: название и количество пользователей в этом чате.
 * Задача:
 * - Удалить с помощью итератора из этого списка те чаты, что содержат менее 1000 пользователей. +
 * - Оставшиеся чаты отсортировать с помощью компараторов по убыванию по количеству пользователей,
 * а если это количество совпадает, то по названию в алфавитном порядке.
 * - Также предоставить сортировку чатов по названию по умолчанию. +
 */

public class ChatListRunner {
    private static final int MIN_USERS_IN_CHAT = 1000;

    public static void main(String[] args) {
        List<ChatList> list = new ArrayList<>(Arrays.asList(
                new ChatList("JavaDevsInterns", 5000),
                new ChatList("JavaDevsUniStudents", 5000),
                new ChatList("JavaDevsJuniors", 2000),
                new ChatList("JavaDevsMiddles", 1500),
                new ChatList("JavaDevsSeniors", 500),
                new ChatList("JavaTeamLeads", 200)
        ));
        System.out.println("Все чаты которые были отсортированы по названию:");
        Collections.sort(list);
        for (ChatList chatList : list) {
            System.out.println(chatList);
        }
        System.out.println();

//              Возможно это надо вынести в отдельный метод.
        Iterator<ChatList> iterator = list.iterator();
        while (iterator.hasNext()) {
            ChatList next = iterator.next();
            if (next.getNumberOfUsers() < MIN_USERS_IN_CHAT) {
                iterator.remove();
            }
        }
        System.out.println("Чаты с пользователями больше тысячи:");
        for (ChatList chatList : list) {
            System.out.println(chatList);
        }
        System.out.println();
        System.out.println("Оставшиеся чаты отсортированы по убыванию и алфавиту в случае," +
                " если кол-во юзеров совпадает: ");
        list.sort(new SortByNames());
        for (ChatList chatList : list) {
            System.out.println(chatList);
        }

    }

    public static class SortByNames implements Comparator<ChatList> {

        @Override
        public int compare(ChatList o1, ChatList o2) {
            if (o1.getNumberOfUsers() == o2.getNumberOfUsers()) {
                return o1.getName().compareTo(o2.getName());
            } else {
                return Integer.compare(o1.getNumberOfUsers(), o2.getNumberOfUsers());
            }
        }
    }
}
