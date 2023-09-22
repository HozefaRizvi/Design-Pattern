/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FacadePattern;

/**
 *
 * @author TechEnclave Computer
 */
class ShapeMaker
{
    private Shape circle;
    private Shape rectangle;
    private Shape square;
    
    public ShapeMaker()
    {
        circle = new Circle();
        rectangle = new Rectangele();
        square = new Square();
    }
    
    public void drawOnCircle()
    {
        circle.draw();
    }
    public void drawOnRectangle()
    {
        rectangle.draw();
    }
    public void drawOnSquare()
    {
        square.draw();
    }
}