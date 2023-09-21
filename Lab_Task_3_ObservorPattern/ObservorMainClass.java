/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ObservorPattern;

/**
 *
 * @author fa20-bse-019
 */
public class ObservorMainClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        System.out.println("\n---------TUTORIAL POINT EXAMPLE-------\n");
        
        Subject subject = new Subject();
        
       IncrementObservorbyten ob1 =  new IncrementObservorbyten(subject);
        DecrementObservorbyfive ob2 = new DecrementObservorbyfive(subject);
        
      System.out.println("First state change: 25");	
      subject.setState(25);
      System.out.println("Second state change: 10");	
      subject.setState(10);
      
      subject.deattach(ob1);
      
      System.out.println("Second state change: 130");	
      subject.setState(130);
      
      
    }
    
}
