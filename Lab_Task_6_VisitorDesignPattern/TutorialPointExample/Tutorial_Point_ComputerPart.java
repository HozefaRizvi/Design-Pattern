/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Visitor_Pattern;

/**
 *
 * @author fa20-bse-019
 */
interface  ComputerPart 
{
   public void accept(ComputerPartVisitor computerPartVisitor);
}
