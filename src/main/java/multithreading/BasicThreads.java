package multithreading;

/*
 * Basic Thread Creation:
 * 
 * Task: Write a program to create two threads—one prints numbers from 1 to 10, and the other prints letters from 'A' to 'J'.
 * Steps:
 * Define tasks for printing numbers and letters (hint: use a method or class to encapsulate the logic).
 * Create two threads by implementing a way to define executable tasks (hint: consider a common interface for tasks).
 * Start both threads and observe the interleaved output due to concurrent execution.
 * Add a small delay (e.g., pause for 500ms) in each iteration to simulate work and make interleaving visible.
 * Goal: Understand thread creation and concurrent execution.
 * 
 */

class NumberPrinterRunnable implements Runnable{
    @Override
    public void run(){
        try {
            for (int i = 0; i <= 10; i++) {
                System.out.println("Number Thread: " + i);
                Thread.sleep(500); 
            }
        } catch (InterruptedException e) {
            System.out.println("Runnable NumberPrinter was interrupted!");
            Thread.currentThread().interrupt();
        }
    }
}

class LetterPrinterRunnable implements Runnable{
    @Override
    public void run(){
        try {
            for (char c = 'A'; c <= 'J'; c++){
                System.out.println("Letter Thread: " + c);
                Thread.sleep(500); 
            }
        } catch (InterruptedException e) {
            System.out.println("Runnable LetterPrinter was interrupted!");
            Thread.currentThread().interrupt();
        }
    }
}

class NumberPrinterThread extends Thread {
    @Override
    public void run(){
        try {
            for (int i = 100; i <= 110; i++) {
                System.out.println("Number Thread: " + i);
                Thread.sleep(500); 
            }
        } catch (InterruptedException e) {
            System.out.println("Thread NumberPrinter was interrupted!");
            Thread.currentThread().interrupt();
        }
    }
}

class LetterPrinterThread extends Thread{
    @Override
    public void run(){
        try {
            for (char c = 'Z'; c >= 'Q'; c--){
                System.out.println("Letter Thread: " + c);
                Thread.sleep(500); 
            }
        } catch (InterruptedException e) {
            System.out.println("Thread NumberPrinter was interrupted!");
            Thread.currentThread().interrupt();
        }
    }
}

public class BasicThreads {
    public static void main(String[] args) {
        // --- Deployment of Runnable-based Threads ---

        // 1. Instantiate the Runnable tasks
        NumberPrinterRunnable numberRunnableTask = new NumberPrinterRunnable();
        LetterPrinterRunnable letterRunnableTask = new LetterPrinterRunnable();

        // 2. Wrap the Runnable tasks in Thread objects
        Thread runnableNumberThread = new Thread(numberRunnableTask);
        Thread runnableLetterThread = new Thread(letterRunnableTask);

        // 3. Start the Runnable-based Threads
        System.out.println("--- Starting Runnable-based Threads ---");
        runnableNumberThread.start();
        runnableLetterThread.start();

        // --- Deployment of Thread-extended Threads ---

        // 1. Instantiate the Thread subclasses directly
        NumberPrinterThread directNumberThread = new NumberPrinterThread();
        LetterPrinterThread directLetterThread = new LetterPrinterThread();

        // 2. Start the Thread-extended Threads
        // (No wrapping needed, as they are already Threads)
        System.out.println("\n--- Starting Thread-extended Threads ---");
        directNumberThread.start();
        directLetterThread.start();

        System.out.println("\nMain thread continues its operations (or waits for others to finish).");
        // You could add Thread.sleep() here for the main thread to wait,
        // or use .join() for more controlled waiting, but for now,
        // just observing the output is sufficient.

    }
}
