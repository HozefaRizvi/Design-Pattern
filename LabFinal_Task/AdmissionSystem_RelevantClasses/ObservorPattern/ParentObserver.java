/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LabFinal.ObservorPattern;

/**
 *
 * @author TechEnclave Computer
 */
public class ParentObserver implements AdmissionObserver {
    @Override
    public void update() {
        System.out.println("ParentObserver: Notification received");
        // Update logic for parents
    }
}
