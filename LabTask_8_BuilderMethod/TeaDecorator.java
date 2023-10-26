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
public class TeaDecorator implements BeverageDecorator {
    private String sweetnessType;
    private boolean cream;
    private int sweetnessLevel;

    public TeaDecorator(String sweetnessType, boolean cream, int sweetnessLevel) {
        this.sweetnessType = sweetnessType;
        this.cream = cream;
        this.sweetnessLevel = sweetnessLevel;
    }

    @Override
    public Beverage decorate(Beverage beverage) {
        beverage.setSweetnessType(this.sweetnessType);
        beverage.setCream(this.cream);
        beverage.setSweetnessLevel(this.sweetnessLevel);
        return beverage;
    }
}
