/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package VisitorPattern_NewLabTask;

/**
 *
 * @author TechEnclave Computer
 */
class Computer implements ComputerPart {

    private ComputerPart[] parts;

    public Computer() {
        parts = new ComputerPart[]{new Mouse(), new Keyboard(), new Monitor(), new Multimedia()};
    }

    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        for (int i = 0; i < parts.length; i++) {
            parts[i].accept(computerPartVisitor);
        }
        computerPartVisitor.visit(this);
    }

    public void maintain(ComputerPartMaintainer computerPartMaintainer, ComputerPart computerPart) {
        computerPartMaintainer.maintain(computerPart);
    }
}