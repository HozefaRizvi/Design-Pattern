/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Template_Pattern;

/**
 *
 * @author fa20-bse-019
 */
public class TemplatePatternMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
      
      System.out.println("\nTUTORIAL POINT EXAMPLE - Visitor PATTERN\n");
      Game game = new Cricket(); 
      game.play();
      System.out.println();
      game = new Football();
      game.play();
    }
    
}
