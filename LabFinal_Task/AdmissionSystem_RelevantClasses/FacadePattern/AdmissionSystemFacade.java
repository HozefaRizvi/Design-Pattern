/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LabFinal.FacadePattern;

/**
 *
 * @author TechEnclave Computer
 */
public class AdmissionSystemFacade {
    private ApplicationSubsystem applicationSubsystem = new ApplicationSubsystem();
    private CommunicationSubsystem communicationSubsystem = new CommunicationSubsystem();
    private EvaluationSubsystem evaluationSubsystem = new EvaluationSubsystem();

    public void processAdmission() {
        applicationSubsystem.process();
        communicationSubsystem.process();
        evaluationSubsystem.process();
    }
}
