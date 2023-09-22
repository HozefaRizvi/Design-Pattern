/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package FacadePattern;

/**
 *
 * @author TechEnclave Computer
 */
public class FacadeMainClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        ShapeMaker ob = new ShapeMaker();
        ob.drawOnCircle();
        ob.drawOnRectangle();
        ob.drawOnSquare();
    }
    
}
