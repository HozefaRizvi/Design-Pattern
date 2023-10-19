/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package VisitorPattern_NewLabTask;

/**
 *
 * @author TechEnclave Computer
 */
public class VisitorPatternMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.accept(new ComputerPartDisplayVisitor());

        // Perform maintenance on specific parts
        ComputerPartMaintainer maintainer = new DisplayMaintainer();
        computer.maintain(maintainer, new Monitor());
        computer.maintain(maintainer, new Multimedia());
    }
    
}
