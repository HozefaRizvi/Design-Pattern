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
interface IChatRoom {
    void showMessage(User user, String message, User targetUser);
    void showMessage(User user, String message, List<User> targetUsers);
}
