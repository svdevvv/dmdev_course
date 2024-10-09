package com.dmdev.cs.homework.collectionsHM.Chat;

public class ChatList implements Comparable<ChatList> {
    private final String name;
    private final int numberOfUsers;

    public ChatList(String name, int numberOfUsers) {
        this.name = name;
        this.numberOfUsers = numberOfUsers;
    }

    public String getName() {
        return name;
    }

    public int getNumberOfUsers() {
        return numberOfUsers;
    }


    @Override
    public String toString() {
        return "ChatList{" +
                "name='" + name + '\'' +
                ", numberOfUsers=" + numberOfUsers +
                '}';
    }

    @Override
    public int compareTo(ChatList o) {
        return getName().compareTo(o.getName());
    }

}
