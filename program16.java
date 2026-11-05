public class program16 extends Thread {
    public void run(){
        System.out.println("Thread is running");
    }    
    public static void main(String[]args) throws InterruptedException{
        System.out.println("thread is started");
        program16 t = new program16();
        t.start();
        t.join();
        System.out.println("thread has complete");

    }
}
