/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LabFinal.BuilderPattern;

import LabFinal.ObservorPattern.AdmissionSystemSubject;
import LabFinal.ObservorPattern.StudentObserver;
import LabFinal.ObservorPattern.ParentObserver;
import LabFinal.StrategyPattern.AdmissionStrategyContext;
import LabFinal.StrategyPattern.MeritBasedAdmission;
import LabFinal.FacadePattern.AdmissionSystemFacade;

/**
 *
 * @author TechEnclave Computer
 */

public class ConcreteAdmissionSystemBuilder implements AdmissionSystemBuilder {
    private AdmissionSystemSubject admissionSystem = new AdmissionSystemSubject();

    @Override
    public void buildSubject() {
        // Build AdmissionSystemSubject
    }

    @Override
    public void buildObservers() {
        // Build observers and attach to the subject
        admissionSystem.attach(new StudentObserver());
        admissionSystem.attach(new ParentObserver());
        // Other observers
    }

    @Override
    public void buildStrategies() {
        // Set admission strategies in the context
        AdmissionStrategyContext strategyContext = new AdmissionStrategyContext();
        strategyContext.setAdmissionStrategy(new MeritBasedAdmission());
        // Other strategies
    }

    @Override
    public void buildSubsystems() {
        // Build subsystems and set in the facade
        AdmissionSystemFacade facade = new AdmissionSystemFacade();
        facade.processAdmission();
    }

    @Override
    public AdmissionSystemSubject getResult() {
        return admissionSystem;
    }
}