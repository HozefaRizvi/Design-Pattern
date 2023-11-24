/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package PrototypePattern;

/**
 *
 * @author TechEnclave Computer
 */
public class Prototypemain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws CloneNotSupportedException {
ShapeCache.loadCache();

        Shape clonedShape = (Shape) ShapeCache.getShape("1");
        System.out.println("Shape : " + clonedShape.getType());		

        Shape clonedShape2 = (Shape) ShapeCache.getShape("2");
        System.out.println("Shape : " + clonedShape2.getType());		

        Shape clonedShape3 = (Shape) ShapeCache.getShape("3");
        System.out.println("Shape : " + clonedShape3.getType());		

        // Creating clones of Fish and Human
        Avatar fish = new Avatar();
        fish.setType("Fish");

        Avatar human = new Avatar();
        human.setType("Human");

        Avatar clonedFish = (Avatar) fish.clone();
        Avatar clonedHuman = (Avatar) human.clone();

        // Comparing Fish and Human clones
        System.out.println("Are Fish and its clone the same? " + fish.equals(clonedFish));
        System.out.println("Are Human and its clone the same? " + human.equals(clonedHuman));	
    }
    
}
