// Create a second thread by extending Thread

package thread;

class NewThread2 extends Thread {
        NewThread2() {
            // Create a new, second thread
            super("Demo Thread");
            System.out.println("Roy thread: " + this);
            start(); // Start the thread
        }
        // This is the entry point for the second thread.
        @Override
        public void run() {
            try {
            for(int i = 5; i > 0; i--) {
            System.out.println("Roy Thread: " + i);
            Thread.sleep(500);
            }
            } catch (InterruptedException e) {
            System.out.println("Roy interrupted.");
            }
            System.out.println("Exiting Roy thread.");
        }
}
class ExtendThread {
 public static void main(String args[]) {
         new NewThread2(); // create a new thread
         
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