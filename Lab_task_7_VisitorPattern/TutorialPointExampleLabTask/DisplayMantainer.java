/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package VisitorPattern_NewLabTask;

/**
 *
 * @author TechEnclave Computer
 */
class DisplayMaintainer implements ComputerPartMaintainer {
    @Override
    public void maintain(ComputerPart computerPart) {
        if (computerPart instanceof Monitor || computerPart instanceof Multimedia) {
            System.out.println("Maintaining " + computerPart.getClass().getSimpleName());
        } else {
            System.out.println("Cannot maintain " + computerPart.getClass().getSimpleName());
        }
    }
}
