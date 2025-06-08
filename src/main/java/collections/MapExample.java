/* 
 * 
 * Task: Create a HashMap to store names of students 
 * (as String) and their corresponding scores (as Integer).
 * Steps:
 * Declare and initialize a HashMap using generics to hold student names as keys and scores as values. 
 * Code to the Map interface for best practice.
 * Add 5 student-score pairs using the appropriate method (e.g., associate a name with a score). 
 * Include at least one duplicate key to see what happens (e.g., add the same student twice with different scores).
 * Print the entire map to observe the key-value pairs and note if the duplicate key affected the original entry.
 * Retrieve a specific student’s score using the key and print the result (test with an existing key and a non-existing key to see the difference).
 * Iterate over the map using a method that shows all key-value pairs and print each entry (hint: consider a way to access both keys and values together).
 * Goal: Practice key-value storage, retrieval, and iteration with a Map.
 */

import java.util.HashMap;

public class MapExample {
    public static void main(String[] args) {
        
        System.out.println("Map exercises:");
        
        HashMap<String, Integer> mapStudents = new HashMap<>();

        // Add key-value pairs
        mapStudents.put("John", 100);
        mapStudents.put("Ringo", 99);
        mapStudents.put("Paul", 80);
        mapStudents.put("George", 100);
        mapStudents.put("George", 1000);

        System.out.println(mapStudents);

        // Access a value by key
        System.out.println("Value for key 'Ringo': " + mapStudents.get("Ringo"));

        // Check if a key exists
        if (mapStudents.containsKey("Liam")) {
            System.out.println("Liam is in the map.");
        } else {
            System.out.println("Liam is NOT in the map.");
        }

        // Iterate through the map
        for (String key : mapStudents.keySet()) {
            System.out.println("Key: " + key + ", Value: " + mapStudents.get(key));
        }
    
        // Remove a key-value pair
        mapStudents.remove("George");
        System.out.println("After removal: " + mapStudents);
    
    }    
}
