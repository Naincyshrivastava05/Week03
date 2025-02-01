package singlylinkedlist.inventary_management_system;
class Inventory {
    private Item head;

    // Add item at the beginning
    public void addItemAtBeginning(String name, int id, int quantity, double price) {
        Item newItem = new Item(name, id, quantity, price);
        newItem.next = head;
        head = newItem;
    }

    // Add item at the end
    public void addItemAtEnd(String name, int id, int quantity, double price) {
        Item newItem = new Item(name, id, quantity, price);
        if (head == null) {
            head = newItem;
            return;
        }
        Item temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newItem;
    }

    // Add item at a specific position
    public void addItemAtPosition(String name, int id, int quantity, double price, int position) {
        Item newItem = new Item(name, id, quantity, price);
        if (position == 1) {
            newItem.next = head;
            head = newItem;
            return;
        }
        Item temp = head;
        for (int i = 1; temp != null && i < position - 1; i++) {
            temp = temp.next;
        }
        if (temp == null) {
            System.out.println("Position out of bounds.");
            return;
        }
        newItem.next = temp.next;
        temp.next = newItem;
    }

    // Remove an item based on Item ID
    public void removeItem(int id) {
        if (head == null) return;
        if (head.id == id) {
            head = head.next;
            return;
        }
        Item temp = head, prev = null;
        while (temp != null && temp.id != id) {
            prev = temp;
            temp = temp.next;
        }
        if (temp == null) {
            System.out.println("Item not found.");
            return;
        }
        prev.next = temp.next;
    }

    // Update quantity of an item based on Item ID
    public void updateQuantity(int id, int newQuantity) {
        Item temp = head;
        while (temp != null) {
            if (temp.id == id) {
                temp.quantity = newQuantity;
                return;
            }
            temp = temp.next;
        }
        System.out.println("Item not found.");
    }

    // Search for an item based on Item ID
    public void searchItemById(int id) {
        Item temp = head;
        while (temp != null) {
            if (temp.id == id) {
                System.out.println("Item Found: " + temp.name + ", ID: " + temp.id + ", Qty: " + temp.quantity + ", Price: " + temp.price);
                return;
            }
            temp = temp.next;
        }
        System.out.println("Item not found.");
    }

    // Search for an item based on Item Name
    public void searchItemByName(String name) {
        Item temp = head;
        while (temp != null) {
            if (temp.name.equalsIgnoreCase(name)) {
                System.out.println("Item Found: " + temp.name + ", ID: " + temp.id + ", Qty: " + temp.quantity + ", Price: " + temp.price);
                return;
            }
            temp = temp.next;
        }
        System.out.println("Item not found.");
    }

    // Calculate and display the total value of inventory
    public void calculateTotalValue() {
        double totalValue = 0;
        Item temp = head;
        while (temp != null) {
            totalValue += temp.quantity * temp.price;
            temp = temp.next;
        }
        System.out.println("Total Inventory Value: $" + totalValue);
    }

    // Sort inventory by Item Name using Merge Sort
    private Item mergeSortByName(Item head) {
        if (head == null || head.next == null)
            return head;

        Item middle = getMiddle(head);
        Item nextOfMiddle = middle.next;
        middle.next = null;

        Item left = mergeSortByName(head);
        Item right = mergeSortByName(nextOfMiddle);

        return sortedMergeByName(left, right);
    }

    private Item sortedMergeByName(Item a, Item b) {
        if (a == null) return b;
        if (b == null) return a;

        if (a.name.compareToIgnoreCase(b.name) < 0) {
            a.next = sortedMergeByName(a.next, b);
            return a;
        } else {
            b.next = sortedMergeByName(a, b.next);
            return b;
        }
    }

    // Sort inventory by Price using Merge Sort
    private Item mergeSortByPrice(Item head) {
        if (head == null || head.next == null)
            return head;

        Item middle = getMiddle(head);
        Item nextOfMiddle = middle.next;
        middle.next = null;

        Item left = mergeSortByPrice(head);
        Item right = mergeSortByPrice(nextOfMiddle);

        return sortedMergeByPrice(left, right);
    }

    private Item sortedMergeByPrice(Item a, Item b) {
        if (a == null) return b;
        if (b == null) return a;

        if (a.price < b.price) {
            a.next = sortedMergeByPrice(a.next, b);
            return a;
        } else {
            b.next = sortedMergeByPrice(a, b.next);
            return b;
        }
    }

    private Item getMiddle(Item head) {
        if (head == null) return head;

        Item slow = head, fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public void sortByItemName() {
        head = mergeSortByName(head);
    }

    public void sortByPrice() {
        head = mergeSortByPrice(head);
    }

    // Display inventory
    public void displayInventory() {
        Item temp = head;
        while (temp != null) {
            System.out.println("Item: " + temp.name + ", ID: " + temp.id + ", Qty: " + temp.quantity + ", Price: $" + temp.price);
            temp = temp.next;
        }
    }
}

