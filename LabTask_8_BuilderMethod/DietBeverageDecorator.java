/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BuilderMethod;

/**
 *
 * @author fa20-bse-019
 */
public class DietBeverageDecorator implements BeverageDecorator {

    DietBeverageDecorator(Tea tea) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    @Override
    public Beverage decorate(Beverage beverage) {
        beverage.setSugarFree(true);
        return beverage;
    }
}