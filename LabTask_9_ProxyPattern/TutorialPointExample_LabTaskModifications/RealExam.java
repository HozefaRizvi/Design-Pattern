/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProxyDesignPattern;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author TechEnclave Computer
 */
public class RealExam implements Exam {
    private List<String> questions;

    public RealExam() {
        // Load questions for the exam (virtual proxy behavior)
        System.out.println("Loading questions for the exam");
        this.questions = new ArrayList<>();
        // Add questions...
    }

    @Override
    public void conductExam() {
        System.out.println("Conducting the exam");
        // Implementation for conducting the exam
    }

    public List<String> getQuestions() {
        return questions;
    }
}

