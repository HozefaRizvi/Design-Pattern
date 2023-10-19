/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Visitor_Pattern;

/**
 *
 * @author fa20-bse-019
 */
public class VisitorPatternMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
      ComputerPart computer = new Computer();
      computer.accept(new ComputerPartDisplayVisitor());
    }
    
}
