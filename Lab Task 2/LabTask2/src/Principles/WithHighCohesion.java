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
public class WithHighCohesion {
    public int length;
    public int width;
    public WithHighCohesion(int length, int width) 
    {
        this.length = length;
        this.width = width;
    }

    public double calculateArea() 
    {
        return length * width;
    }
    
    
}
