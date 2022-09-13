package org.launchcode.java.demos.lsn7interfaces;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        Case menu = new Case();
        ArrayList<Flavor> flavors = menu.getFlavors();
        ArrayList<Cone> cones = menu.getCones();
        ArrayList<Topping> toppings = menu.getToppings();

        // TODO: Use a Comparator class to sort the 'flavors' array alphabetically by the 'name'
        //  field.
        flavors.sort(new FlavorComparator()); //sorts ascending (alphabetical) on name
        flavors.sort(new FlavorAllergensComparator()); //sorts descending on number of allergens

        // TODO: Use a Comparator class to sort the 'cones' array in increasing order by the 'cost'
        //  field.
        cones.sort(new ConeComparator());

        // Bonus
        toppings.sort(new ToppingComparator().reversed());

        // TODO: Print the 'flavors' and 'cones' lists (in a clear manner) to verify the sorting.
        System.out.println("\nFlavors: ");
        for (Ingredient ingredient : flavors) {
            System.out.println(ingredient.getName());
        }
        System.out.println("\nVessels/Cones: ");
        for (Ingredient ingredient : cones) {
            System.out.format("%s $%.2f%n",ingredient.getName(),ingredient.getCost());
        }
        System.out.println("\nToppings: ");
        for (Ingredient ingredient : toppings) {
//            System.out.println(ingredient.getName()+": $"+ ingredient.getCost());
            System.out.format("%s $%.2f%n",ingredient.getName(),ingredient.getCost());
        }
    }
}
