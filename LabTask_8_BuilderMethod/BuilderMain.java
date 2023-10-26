/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BuilderMethod;

import java.util.Scanner;

/**
 *
 * @author fa20-bse-019
 */
public class BuilderMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // Create a MealBuilder object.
        MealBuilder mealBuilder = new MealBuilder();

        // Get the user's beverage preference.
        String beverageType = getBeverageType();

        // Get the user's tea preference.
        String teaPreference = getTeaPreference();

        // Prepare the meal with the user's beverage preference.
        Meal meal = mealBuilder.prepareMealWithBeverage(beverageType, teaPreference);

        // Show the meal details to the user.
        meal.showItems();
    }

    private static String getBeverageType() {
        System.out.println("Do you want a diet beverage? (Y/N)");
        Scanner scanner = new Scanner(System.in);
        String beverageType = scanner.nextLine();
        return beverageType;
    }

    private static String getTeaPreference() {
        System.out.println("Do you want tea? (Y/N)");
        Scanner scanner = new Scanner(System.in);
        String teaPreference = scanner.nextLine();
        return teaPreference;
    }
}