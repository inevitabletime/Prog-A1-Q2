/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package bakingstore;

import javax.swing.JOptionPane;

public class InventoryApp {

    public static void main(String[] args) {
        Inventory inventory = new Inventory();

        while (true) {
            String[] options = {"View Inventory", "Add Ingredient", "Update Ingredient", "Remove Ingredient", "Exit"};
            int choice = JOptionPane.showOptionDialog(null, 
                    "Choose an option:", 
                    "Baking Store Inventory", 
                    JOptionPane.DEFAULT_OPTION, 
                    JOptionPane.INFORMATION_MESSAGE, 
                    null, 
                    options, 
                    options[0]);

            if (choice == 4) {
                JOptionPane.showMessageDialog(null, "Exiting...");
                break;
            }

            switch (choice) {
                case 0: // View Inventory
                    JOptionPane.showMessageDialog(null, inventory.viewInventory());
                    break;
                case 1: // Add Ingredient
                    String addName = JOptionPane.showInputDialog("Enter ingredient name:");
                    int addQuantity = Integer.parseInt(JOptionPane.showInputDialog("Enter quantity:"));
                    inventory.addIngredient(addName, addQuantity);
                    JOptionPane.showMessageDialog(null, "Ingredient added/updated successfully.");
                    break;
                case 2: // Update Ingredient
                    String updateName = JOptionPane.showInputDialog("Enter ingredient name to update:");
                    int updateQuantity = Integer.parseInt(JOptionPane.showInputDialog("Enter new quantity:"));
                    if (inventory.updateIngredient(updateName, updateQuantity)) {
                        JOptionPane.showMessageDialog(null, "Ingredient updated successfully.");
                    } else {
                        JOptionPane.showMessageDialog(null, "Ingredient not found.");
                    }
                    break;
                case 3: // Remove Ingredient
                    String removeName = JOptionPane.showInputDialog("Enter ingredient name to remove:");
                    if (inventory.removeIngredient(removeName)) {
                        JOptionPane.showMessageDialog(null, "Ingredient removed successfully.");
                    } else {
                        JOptionPane.showMessageDialog(null, "Ingredient not found.");
                    }
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Invalid choice. Please try again.");
                    break;
            }
        }
    }
}
