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
public class MainClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //with high cohesion it tell that class have a single functionaliuty not mixed
        //here im choosing rectange for area calculation
        System.out.println("PRINCIPLE 1 - WITH HIGH COHESION");
        WithHighCohesion ob = new WithHighCohesion(10,12);
        System.out.println("Area of rectangle:\t"+ob.calculateArea());
        
        //Without high cohesion we dont kknow what shape are we're finding 
         System.out.println("PRINCIPLE 1 - WITHOUT HIGH COHESION");
        WithoutCohesion ob1 = new WithoutCohesion(10,12);
        System.out.println("Area calculatioon:\t"+ob1.calculateArea());
        
        System.out.println("PRINCIPLE 2 - WITH POLYMORPHISAM\n");
        Shape circle = new Circle(5.0);
        Shape rectangle = new Rectangle(4.0, 6.0);
        System.out.println("Circle Area:s " + circle.calculateArea());
        System.out.println("Rectangle Area: " + rectangle.calculateArea());
        System.out.println("PRINCIPLE 2 - WITHOUT POLYMORPHISAM\n");
        Circle1 circle1 = new Circle1(5.0);
        Rectangle1 rectangle1 = new Rectangle1(4.0, 6.0);

        System.out.println("Circle Area: " + circle1.calculateCircleArea());
        System.out.println("Rectangle \t" + rectangle1.calculateRectangleArea());
        
        System.out.println("\nPRINCIPLE 3 - WITH LOW COUPLING\n");
        Calculator calculator = new Calculator();
        int sum = calculator.add(5, 3);
        int difference = calculator.subtract(10, 4);
       
        System.out.println("\nPRINCIPLE 4 - WITH CREATOR\n");
        
        ManagerCreator creator  = new ManagerCreator();
        Manager m1 = creator.createManager(1, "Hozefa");
        Manager m2 = creator.createManager(2, "Ali");
        m1.Introduction();
        m2.Introduction();
        
        System.out.println("\nPRINCIPLE 5 - WITH INDIRECTION\n");
        DataService concreteService = new ConcreteDataService();
        System.out.println("Direct fetch: " + concreteService.fetchData());
        DataService indirectionService = new DataServiceIndirection(new ConcreteDataService());
        System.out.println("Indirect fetch: " + indirectionService.fetchData());
        
    }
    
}
