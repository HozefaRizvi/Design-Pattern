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
public class IncrementObservorbyten extends Observor
{
    public IncrementObservorbyten(Subject subject)
    {
        this.subject = subject;   
        this.subject.attach(this);
    }
    
   public void update() 
   {
     int sum = subject.getState() + 10;
     System.out.println( "Incrment"+sum ); 
   }

}
