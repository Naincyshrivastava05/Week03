package singlylinkedlist.inventary_management_system;

public class Main {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();

        // Sample operations
        inventory.addItemAtBeginning("Laptop", 101, 5, 800);
        inventory.addItemAtEnd("Mouse", 102, 10, 25);
        inventory.addItemAtEnd("Keyboard", 103, 7, 45);
        inventory.addItemAtBeginning("Monitor", 104, 3, 150);

        inventory.displayInventory();

        inventory.updateQuantity(102, 15);
        inventory.searchItemById(102);
        inventory.searchItemByName("Keyboard");

        inventory.calculateTotalValue();

        System.out.println("Sorted by Name:");
        inventory.sortByItemName();
        inventory.displayInventory();

        System.out.println("Sorted by Price:");
        inventory.sortByPrice();
        inventory.displayInventory();
    }
}
