/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Mediator_DesignPattern;

import java.util.Date;
import java.util.List;

/**
 *
 * @author TechEnclave Computer
 */
class ChatRoom implements IChatRoom 
{
   
     public static void showMessage(User user, String message, User targetUser) {
        System.out.println(new Date().toString() + " [" + user.getName() + " to " + targetUser.getName() + "] : " + message);
    }

    public  static void showMessage(User user, String message, List<User> targetUsers) {
        StringBuilder targetNames = new StringBuilder();
        for (User target : targetUsers) {
            targetNames.append(target.getName()).append(", ");
        }
        System.out.println(new Date().toString() + " [" + user.getName() + " to " + targetNames.toString() + "] : " + message);
    }
}
