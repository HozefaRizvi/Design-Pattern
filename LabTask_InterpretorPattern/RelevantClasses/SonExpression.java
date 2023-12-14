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
public class SonExpression implements Expression {
	
   private Expression parent;
   private Expression son;

   public SonExpression(Expression parent, Expression son) {
      this.parent = parent;
      this.son = son;
   }

   @Override
   public boolean interpret(String context) {
      return parent.interpret(context) && son.interpret(context);
   }
}

