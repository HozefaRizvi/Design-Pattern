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
public class MealBuilder {

   public Meal prepareVegMeal (){
      Meal meal = new Meal();
      meal.addItem(new VegBurger());
      meal.addItem(new Coke());
      return meal;
   }   

   public Meal prepareNonVegMeal (){
      Meal meal = new Meal();
      meal.addItem(new ChickenBurger());
      meal.addItem(new Pepsi());
      return meal;
   }
   public Meal prepareMealWithBeverage(String beverageType, String teaPreference) {
        Meal meal = new Meal();

        // Prepare the main course.
        if (beverageType.equalsIgnoreCase("Y")) {
            if (teaPreference.equalsIgnoreCase("Y")) {
                Tea tea = new Tea() {
                    @Override
                    public float getPrice() {
                        return 1.75f;
                    }
                };
                meal.addItem(new DietBeverageDecorator(tea));
            } else {
                meal.addItem(new DietCoke());
            }
        } else {
            if (teaPreference.equalsIgnoreCase("Y")) {
                meal.addItem(new Tea() {});
            } else {
                meal.addItem(new Coke());
            }
        }

        // Return the prepared meal.
        return meal;
    }
}
