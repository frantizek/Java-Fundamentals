/* 
 * Task: Create an ArrayList to store names of 5 friends (as String objects). 
 * Use generics for type safety.
 */
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListExample {

    public static void main(String[] args) {
        System.out.println("List examples:");

        List<String> friendList = new ArrayList <String>();

        System.out.println("Initial state of friend list: " + friendList); 

        /*for (String friend : friendList) {
            System.out.println(friend);
        }*/
        
        friendList.add("Maximiliano");
        friendList.add("Donatello");
        friendList.add("Leonardo");
        friendList.add("Miguel Angel");
        friendList.add("Raphael");

        System.out.println("I just added 5 persons to my friend list : " + friendList); 

        // Remove one name using remove() (by index or value).

        friendList.remove(0);

        System.out.println("I removed the index 0 of the list : " + friendList); 

        friendList.add("Maximiliano");

        friendList.remove("Leonardo");

        System.out.println("Added back Maximiliano and now deleted Leonardo : " + friendList); 

        // Replace another name using set() at a specific index.

        friendList.set(1, "Adan");

        System.out.println("Now used the set to remove whoever was at index 1 : " + friendList); 

        // Iterate over the list and print each name using a for-each loop and separately using an Iterator

        for (int i = 0; i < friendList.size(); i++) {
            // code block to be executed
            System.out.println("This is position : " + i + " and at this position we have: " + friendList.get(i)); 
        }

        for (String friend : friendList) {
            System.out.println("For each print = " + friend);
        }

        // Initializing any variable to 0
        int i = 0;

        // If variable value is lesser than
        // value indicating size of List
        while (i < friendList.size()) {

            // Print element of list
            System.out.println("While print = " + friendList.get(i));

            // Increase variable count by 1
            i++;
        }

        // Iterator
        ListIterator<String> it = friendList.listIterator();

        // Condition check for elements in List
        // using hasNext() method returning true till
        // there is single element in a List
        while (it.hasNext()) {

            // Print all elements of List
            System.out.println("hasNext print = " + it.next());
        }

        // Lambda expression printing all elements in a List
        friendList.forEach((temp) -> { System.out.println("Lambda print = " + temp); });


        // stream.forEach() method prints
        // all elements inside a List
        friendList.stream().forEach(
            (temp) -> System.out.println(temp));

    }    
     
}
