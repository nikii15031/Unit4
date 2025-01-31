/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package coffeeordersystem;

/**
 *
 * @author roydo
 */
public class CoffeeOrderSystem {

public static void main(String[] args) {
        // Creating a basic coffee
        Coffee coffee = new Coffee();

        // Customizing the coffee with different decorators
        coffee = new MilkDecorator(coffee);   // Adding Milk
        coffee = new SugarDecorator(coffee);  // Adding Sugar
        coffee = new SyrupDecorator(coffee);  // Adding Syrup

        // Outputting the final description and cost
        System.out.println("Order: " + coffee.getDescription());
        System.out.println("Total Cost: $" + coffee.cost());
    }
}