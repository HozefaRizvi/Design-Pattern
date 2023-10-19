/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package VisitorPattern_NewLabTask;

/**
 *
 * @author TechEnclave Computer
 */
interface ComputerPart {
    void accept(ComputerPartVisitor computerPartVisitor);
}
