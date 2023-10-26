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
public class DietPepsi extends Bevrage {
    public DietPepsi(Beverage beverage) {
        super(beverage);
        beverage.setprice(beverage.getPrice() - 0.5f);
    }
}
