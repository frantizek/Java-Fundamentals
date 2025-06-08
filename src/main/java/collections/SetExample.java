
/* 
 * Task: Create a HashSet to store 10 random integers, including some duplicates.
 * Steps:
 * Add the numbers using add() (try adding duplicates to see they’re ignored).
 * Print the set to observe that duplicates are removed and order isn’t guaranteed.
 * Check if a specific number exists using contains().
 * Goal: Learn how sets ensure uniqueness and handle basic lookups.
 */
import java.util.HashSet;
import java.util.Set;
import java.util.Random;


public class SetExample{

    public static void main(String[] args) {
        System.out.println("Set examples:");

        Set<Integer> numberHash = new HashSet<>();
       
        System.out.println(numberHash);

        Random random = new Random();

        for (int i = 0; i < 10; i++) {
            int randomNumber = random.nextInt(50) + 1;
            numberHash.add(randomNumber);
        }

        System.out.println(numberHash);

        if (numberHash.contains(69)){
            System.out.println("We should NEVER see this printed.");
        } else {
            System.out.println("We KNOW that 69 is not contained in the original Hash.");
        }


        // This is cheating since I know that the numberHash random was limited
        numberHash.add(69);

        System.out.println(numberHash);

        System.out.println("69 was added, also notice the location of 69 within the hash.");

        numberHash.add(69);

        System.out.println(numberHash);

        System.out.println("I attempted to add again 69, see if twice? Hope you don't!");

        if (numberHash.contains(69)){
            System.out.println("We should see this printed. 69 is cointained within the Hash.");
        } else {
            System.out.println("We should NEVER see this printed.");
        }



    }

 }