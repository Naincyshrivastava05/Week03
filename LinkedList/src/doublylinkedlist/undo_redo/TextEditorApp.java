package doublylinkedlist.undo_redo;

public class TextEditorApp {
    public static void main(String[] args) {
        TextEditor editor = new TextEditor();

        editor.addState("Hello");
        editor.addState("Hello, World!");
        editor.addState("Hello, World! This is a text editor.");
        editor.displayState(); // Current: "Hello, World! This is a text editor."

        editor.undo();
        editor.displayState(); // Current: "Hello, World!"

        editor.undo();
        editor.displayState(); // Current: "Hello"

        editor.redo();
        editor.displayState(); // Current: "Hello, World!"

        editor.addState("New content after undo.");
        editor.displayState(); // Current: "New content after undo."

        editor.undo();
        editor.displayState(); // Current: "Hello, World!"
    }
}