/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package bakingstore;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class InventoryTest {
    private Inventory inventory;

    @Before
    public void setUp() {
        inventory = new Inventory();
    }

    @Test
    public void testAddIngredient() {
        inventory.addIngredient("Honey", 3);
        assertTrue(inventory.viewInventory().contains("Ingredient: Honey, Quantity: 3"));
    }

    @Test
    public void testUpdateIngredient() {
        inventory.updateIngredient("Sugar", 10);
        assertTrue(inventory.viewInventory().contains("Ingredient: Sugar, Quantity: 10"));
    }

    @Test
    public void testRemoveIngredient() {
        inventory.removeIngredient("Butter");
        assertFalse(inventory.viewInventory().contains("Ingredient: Butter"));
    }
}
