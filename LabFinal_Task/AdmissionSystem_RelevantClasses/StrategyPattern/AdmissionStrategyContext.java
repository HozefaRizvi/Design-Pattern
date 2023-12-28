/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LabFinal.StrategyPattern;

/**
 *
 * @author TechEnclave Computer
 */
public class AdmissionStrategyContext {
    private AdmissionStrategy admissionStrategy;

    public void setAdmissionStrategy(AdmissionStrategy strategy) {
        this.admissionStrategy = strategy;
    }

    public void performAdmission() {
        if (admissionStrategy != null) {
            admissionStrategy.executeStrategy();
        }
    }
}