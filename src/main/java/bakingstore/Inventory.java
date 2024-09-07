/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package bakingstore;

import java.util.ArrayList;
import java.util.List;

public class Inventory {
    private List<Ingredient> ingredients;

    public Inventory() {
        this.ingredients = new ArrayList<>();
        initializeDefaultIngredients();
    }

    private void initializeDefaultIngredients() {
        ingredients.add(new Ingredient("Flour", 10));
        ingredients.add(new Ingredient("Sugar", 5));
        ingredients.add(new Ingredient("Butter", 3));
        ingredients.add(new Ingredient("Eggs", 12));
        ingredients.add(new Ingredient("Baking Powder", 2));
        ingredients.add(new Ingredient("Vanilla Extract", 1));
    }

    public void addIngredient(String name, int quantity) {
        for (Ingredient ingredient : ingredients) {
            if (ingredient.getName().equalsIgnoreCase(name)) {
                ingredient.setQuantity(ingredient.getQuantity() + quantity);
                return;
            }
        }
        ingredients.add(new Ingredient(name, quantity));
    }

    public boolean updateIngredient(String name, int quantity) {
        for (Ingredient ingredient : ingredients) {
            if (ingredient.getName().equalsIgnoreCase(name)) {
                ingredient.setQuantity(quantity);
                return true;
            }
        }
        return false;
    }

    public boolean removeIngredient(String name) {
        return ingredients.removeIf(ingredient -> ingredient.getName().equalsIgnoreCase(name));
    }

    public String viewInventory() {
        StringBuilder sb = new StringBuilder();
        for (Ingredient ingredient : ingredients) {
            sb.append(ingredient).append("\n");
        }
        return sb.toString();
    }
}




