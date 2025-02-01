package hashmap_hashcode.custom_hashmap;


import java.util.LinkedList;

class CustomHashMap<K, V>{
    private static final int SIZE = 16; // Default size of the hash table
    private LinkedList<Entry<K, V>>[] table; // Array of linked lists for separate chaining

    public CustomHashMap() {
        table = new LinkedList[SIZE];
    }

    private int hash(K key) {
        return Math.abs(key.hashCode() % SIZE); // Compute hash index
    }

    public void put(K key, V value) {
        int index = hash(key);
        if (table[index] == null) {
            table[index] = new LinkedList<>();
        }
        for (Entry<K, V> entry : table[index]) {
            if (entry.key.equals(key)) {
                entry.value = value; // Update value if key exists
                return;
            }
        }
        table[index].add(new Entry<>(key, value)); // Insert new entry
    }

    public V get(K key) {
        int index = hash(key);
        if (table[index] != null) {
            for (Entry<K, V> entry : table[index]) {
                if (entry.key.equals(key)) {
                    return entry.value;
                }
            }
        }
        return null; // Key not found
    }

    public void remove(K key) {
        int index = hash(key);
        if (table[index] != null) {
            table[index].removeIf(entry -> entry.key.equals(key));
        }
    }

    public void printMap() {
        for (int i = 0; i < SIZE; i++) {
            if (table[i] != null) {
                for (Entry<K, V> entry : table[i]) {
                    System.out.println("Key: " + entry.key + ", Value: " + entry.value);
                }
            }
        }
    }

    // Inner class to represent key-value pairs
    private static class Entry<K, V> {
        K key;
        V value;

        Entry(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }


}
