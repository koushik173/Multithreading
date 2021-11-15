//Implementing Runnable
package thread;

// Create a second thread.
class NewThread implements Runnable {
        Thread t;
        NewThread() {
                // Create a new, second thread
                t = new Thread(this, "Demo Thread");
                System.out.println("Roy thread: " + t);
                t.start(); // Start the thread
        }
        // This is the entry point for the second thread.
        @Override
        public void run() {
                try {
                        for(int i = 5; i > 0; i--) {
                        System.out.println("Roy Thread: " + i);
                        Thread.sleep(1000);
                }
                } catch (InterruptedException e) {
                        System.out.println("Roy interrupted.");
                }
                System.out.println("Exiting Roy thread.");
        }
 }
class ThreadDemo {
 public static void main(String args[ ] ) {
        new NewThread(); // create a new thread
 try {
    for(int i = 5; i > 0; i--) {
        System.out.println("Main Thread: " + i);
    Thread.sleep(1000);
 }
 } catch (InterruptedException e) {
        System.out.println("Main thread interrupted.");
 }
        System.out.println("Main thread exiting.");
 }
}