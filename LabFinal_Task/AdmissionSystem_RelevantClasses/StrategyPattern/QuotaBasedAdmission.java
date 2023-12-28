/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LabFinal.StrategyPattern;

/**
 *
 * @author TechEnclave Computer
 */
public class QuotaBasedAdmission implements AdmissionStrategy {
    @Override
    public void executeStrategy() {
        System.out.println("Executing Quota-Based Admission Strategy");
        // Strategy-specific logic
    }
}