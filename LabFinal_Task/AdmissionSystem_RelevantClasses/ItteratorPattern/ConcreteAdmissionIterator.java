/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LabFinal.ItteratorPattern;

/**
 *
 * @author TechEnclave Computer
 */
import LabFinal.ObservorPattern.AdmissionSystemSubject;
import java.util.List;
public class ConcreteAdmissionIterator implements AdmissionIterator {
    private int index;
    private List<AdmissionSystemSubject> admissionList;

    public ConcreteAdmissionIterator(List<AdmissionSystemSubject> admissionList) {
        this.admissionList = admissionList;
        this.index = 0;
    }

    @Override
    public boolean hasNext() {
        return index < admissionList.size();
    }

    @Override
    public AdmissionSystemSubject next() {
        if (hasNext()) {
            return admissionList.get(index++);
        }
        return null;
    }
}