/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Mediator_DesignPattern;

import java.util.List;

/**
 *
 * @author TechEnclave Computer
 */
class User {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User(String name) {
        this.name = name;
    }

    public void sendMessage(String message, User targetUser) {
        ChatRoom.showMessage(this, message, targetUser);
    }

    public void sendMessage(String message, List<User> targetUsers) {
        ChatRoom.showMessage(this, message, targetUsers);
    }
}
