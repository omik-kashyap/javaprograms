public class program18 {
    static class lowPriority extends Thread{
        public void run(){
            System.out.println("LowPriority=" + this.getPriority());
        }
    }
    static class HighPriority extends Thread{
        public void run(){
            System.out.println("Highpriority" + this.getPriority());
        }
    }
    public static void main(String[]args) throws InterruptedException
{
   lowPriority t1 = new lowPriority();
   HighPriority t2 = new HighPriority();
   t1.setPriority(3);
   t2.setPriority(8);
   t1.start();
   t1.join();
   t2.start();
   t2.join();
   System.out.println("both threads completed");
    }
    
}
