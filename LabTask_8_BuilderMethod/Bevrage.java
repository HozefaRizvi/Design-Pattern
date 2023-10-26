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
 abstract class Beverage {
    private String name;
    private boolean sugarFree;
    private String sweetnessType;
    private boolean cream;
    private int sweetnessLevel;
    private float price;

    public Beverage(String name) {
        this.name = name;
        this.sugarFree = false;
        this.sweetnessType = "";
        this.cream = false;
        this.sweetnessLevel = 0;
    }

    public String getName() {
        return name;
    }

    public void setSugarFree(boolean sugarFree) {
        this.sugarFree = sugarFree;
    }

    public boolean isSugarFree() {
        return sugarFree;
    }

    public String getSweetnessType() {
        return sweetnessType;
    }

    public void setSweetnessType(String sweetnessType) {
        this.sweetnessType = sweetnessType;
    }

    public boolean isCream() {
        return cream;
    }

    public void setCream(boolean cream) {
        this.cream = cream;
    }

    public int getSweetnessLevel() {
        return sweetnessLevel;
    }

    public void setSweetnessLevel(int sweetnessLevel) {
        this.sweetnessLevel = sweetnessLevel;
    }

    public abstract float getPrice();

   public void setprice(float price) {
        this.price = price;
    }
}
