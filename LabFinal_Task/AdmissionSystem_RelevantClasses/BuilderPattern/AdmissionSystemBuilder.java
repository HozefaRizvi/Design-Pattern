/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package LabFinal.BuilderPattern;

import LabFinal.ObservorPattern.AdmissionSystemSubject;

/**
 *
 * @author TechEnclave Computer
 */

public interface AdmissionSystemBuilder {
    void buildSubject();
    void buildObservers();
    void buildStrategies();
    void buildSubsystems();
    AdmissionSystemSubject getResult();
}