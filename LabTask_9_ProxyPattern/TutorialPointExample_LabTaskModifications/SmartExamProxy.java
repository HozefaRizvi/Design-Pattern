/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProxyDesignPattern;

import java.util.List;

/**
 *
 * @author TechEnclave Computer
 */
public class SmartExamProxy implements Exam {
    private RealExam realExam;

    @Override
    public void conductExam() {
        if (realExam == null) {
            realExam = new RealExam();
        }
        realExam.conductExam();
    }

    public void addStudentAnswers(String answers) {
        // Implementation for adding student answers
        System.out.println("Adding student answers to the exam");
    }

    public void viewResults(Student student) {
        if (student.isTeacher()) {
            // Protected proxy behavior - Teacher sees a collection of results
            System.out.println("Teacher is viewing exam results");
            List<String> results = realExam.getQuestions();  // This is just an example, you should have a method to get results
            // Display results...
        } else {
            // Protected proxy behavior - Student sees only his results
            System.out.println("Student is viewing his exam results");
            // Display only the specific student's results...
        }
    }
}