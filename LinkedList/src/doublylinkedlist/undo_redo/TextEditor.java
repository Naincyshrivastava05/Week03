package doublylinkedlist.undo_redo;

class TextEditor {
    private Node head, current;
    private final int MAX_HISTORY = 10;
    private int size = 0;

    public TextEditor() {
        head = new Node(""); // Initial empty state
        current = head;
    }

    // Add new text state (store history)
    public void addState(String newText) {
        Node newNode = new Node(newText);
        newNode.prev = current;
        current.next = newNode;
        current = newNode;

        // Maintain history limit
        if (size == MAX_HISTORY) {
            head = head.next;
            head.prev = null;
        } else {
            size++;
        }
    }

    // Undo function (move to previous state)
    public void undo() {
        if (current.prev != null) {
            current = current.prev;
        } else {
            System.out.println("No more undo available.");
        }
    }

    // Redo function (move to next state)
    public void redo() {
        if (current.next != null) {
            current = current.next;
        } else {
            System.out.println("No more redo available.");
        }
    }

    // Display the current text state
    public void displayState() {
        System.out.println("Current Text: " + current.text);
    }
}