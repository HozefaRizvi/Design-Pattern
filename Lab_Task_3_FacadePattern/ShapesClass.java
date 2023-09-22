/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FacadePattern;

/**
 *
 * @author TechEnclave Computer
 */
interface Shape
{
    void draw();
}

class Rectangele implements Shape
{

    @Override
    public void draw() 
    {
        System.out.println("Recntangle draw()");
    }
  
}
class Circle implements Shape
{

    @Override
    public void draw() 
    {
        System.out.println("Circle draw()");
    }
}
class Square implements Shape
{

    @Override
    public void draw() 
    {
        System.out.println("square draw()");
    }
}
