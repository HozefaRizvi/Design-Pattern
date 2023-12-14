/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InterpreterPattern;

/**
 *
 * @author fa20-bse-019
 */
public class TerminalExpression implements Expression {
	
   private String data;

   public TerminalExpression(String data){
      this.data = data; 
   }

   @Override
   public boolean interpret(String context) {
   
      if(context.contains(data)){
         return true;
      }
      return false;
   }
}
