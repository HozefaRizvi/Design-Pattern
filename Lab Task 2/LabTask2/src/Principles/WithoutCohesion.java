/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principles;

/**
 *
 * @author fa20-bse-019
 */
public class WithoutCohesion {
       public int radius;
    public int quantity;
    public WithoutCohesion(int radius, int quantity) 
    {
        this.radius = radius;
        this.quantity = quantity;
    }

    public double calculateArea() 
    {
        return Math.PI* radius * quantity;
    }
}
