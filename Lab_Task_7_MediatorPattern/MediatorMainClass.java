/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Mediator_DesignPattern;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author TechEnclave Computer
 */
public class MediatorMainClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        User robert = new User("Robert");
        User john = new User("John");
        User mAli = new User("M Ali");
        University comsatsUniversity = new University("COMSATS University");
        University nustUniversity = new University("NUST");
        Teacher teacherAli = new Teacher("Teacher Sir Ali");
        User ahmad = new User("Ahmad");
        User ali = new User("Ali");

        robert.sendMessage("Hi! John!", john);
        john.sendMessage("Hello! Robert!", robert);
        mAli.sendMessage("Hello, this is M Ali", comsatsUniversity);
        
        List<Object> targets = new ArrayList<>();
        targets.add(comsatsUniversity);
        targets.add(nustUniversity);
        targets.add(teacherAli);
        targets.add(ahmad);
        targets.add(ali);
        mAli.sendMessage("Hello everyone!", targets);
    }
    
}
