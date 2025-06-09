package multithreading;

/*
 * Thread Synchronization:
 * 
 * Task: Create a program with a shared counter that two threads increment 100 times each, ensuring correct results with synchronization.
 * Steps:
 * Create a class with a shared variable (e.g., a counter starting at 0).
 * Define a method to increment the counter, called by multiple threads.
 * Create two threads that each call the increment method 100 times.
 * Run without protection first to see incorrect results (race condition), then add a mechanism to protect the shared resource (hint: use a keyword to lock access).
 * Print the final counter value (should be 200 if protected correctly).
 * Goal: Learn the importance of synchronization to avoid race conditions.
 * 
 */

class InternalSharedCounter {
    private int count = 0;

    public int getValue() {
        return count;
    }

    public synchronized void increment()  {
        String threadName = Thread.currentThread().getName();
        System.out.println(threadName + " is about to increment. Current count: " + count);
        count++;
        System.out.println(threadName + " finished incrementing. New count: " + count);
        try {
            Thread.sleep(10); 
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}

class CounterIncremented implements Runnable {
    private InternalSharedCounter internalSharedCounter;

    /**
     * Constructor to initialize CounterIncremented.
     */
    public CounterIncremented(InternalSharedCounter internalSharedCounter) {
        this.internalSharedCounter = internalSharedCounter;
    }

    @Override
    public void run(){
        for (int i = 0; i < 100; i++) {
                internalSharedCounter.increment();
        }
    }
}

public class SharedCounter {

    public static void main(String[] args) {
        InternalSharedCounter internalSharedCounter = new InternalSharedCounter();
        CounterIncremented counterIncremented_001 = new CounterIncremented(internalSharedCounter);
        CounterIncremented counterIncremented_002 = new CounterIncremented(internalSharedCounter);

        Thread runnableCounterIncremented_001 = new Thread(counterIncremented_001);
        Thread runnableCounterIncremented_002 = new Thread(counterIncremented_002);

        // 3. Start the Runnable-based Threads
        System.out.println("--- Starting Runnable-based Threads ---");
        runnableCounterIncremented_001.start();
        runnableCounterIncremented_002.start();

        try {
            runnableCounterIncremented_001.join();
            runnableCounterIncremented_002.join();
        } catch (InterruptedException e) {
            System.out.println("Thread was interrupted!");
            Thread.currentThread().interrupt();
        }
        System.out.println("the final value of " + internalSharedCounter.getValue());

    }
}
