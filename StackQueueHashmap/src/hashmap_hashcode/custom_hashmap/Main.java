package hashmap_hashcode.custom_hashmap;

public class Main {
    public static void main(String[] args) {
        CustomHashMap<String, Integer> map = new CustomHashMap<>();
        map.put("One", 1);
        map.put("Two", 2);
        map.put("Three", 3);
        map.put("Four", 4);
        map.put("Two", 22); // Updating an existing key

        System.out.println("Value for 'Two': " + map.get("Two"));
        map.remove("Three");

        System.out.println("\nFinal HashMap:");
        map.printMap();
    }
}
