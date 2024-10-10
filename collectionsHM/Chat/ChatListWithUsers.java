package com.dmdev.cs.homework.collectionsHM.Chat;

import java.util.List;

public class ChatListWithUsers {
    private final String name;
    private List<User> users;

    public ChatListWithUsers(String name, List<User> users) {
        this.name = name;
        this.users = users;
    }

    public String getName() {
        return name;
    }

    public List<User> getUsers() {
        return users;
    }

    @Override
    public String toString() {
        return "ChatListWithUsers{" +
                "name='" + name + '\'' +
                ", users=" + users +
                '}';
    }
}
