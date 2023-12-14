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
public class InterpreterMain {

  // Rule: Robert and John are male
   public static Expression getMaleExpression() {
      Expression robert = new TerminalExpression("Robert");
      Expression john = new TerminalExpression("John");
      return new OrExpression(robert, john);
   }

   // Rule: Julie is a married woman
   public static Expression getMarriedWomanExpression() {
      Expression julie = new TerminalExpression("Julie");
      Expression married = new TerminalExpression("Married");
      return new AndExpression(julie, married);
   }

   // Rule: Stuart is a son of Robert
   public static Expression getSonExpression() {
      Expression robert = new TerminalExpression("Robert");
      Expression stuart = new TerminalExpression("Stuart");
      return new SonExpression(robert, stuart);
   }

   public static void main(String[] args) {
      Expression isMale = getMaleExpression();
      Expression isMarriedWoman = getMarriedWomanExpression();
      Expression isSon = getSonExpression();

      System.out.println("John is male? " + isMale.interpret("John"));
      System.out.println("Julie is a married woman? " + isMarriedWoman.interpret("Married Julie"));
      System.out.println("Stuart is a son of Robert? " + isSon.interpret("Stuart is a son of Robert"));
   }
}
