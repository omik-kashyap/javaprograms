public class program23 {
   static class shared{
    String message = null;
    synchronized void waitformessage() throws InterruptedException {
System.out.println("waiting for message");
while (message == null)
    wait();
System.out.println("message received" + message);
    }
    synchronized void setmessage(String msg){
        message = msg;
        notify();
    }
   }
public static void main(String[] args) throws InterruptedException {
    shared shared = new shared();
    Thread receiver = new Thread(()->{
        try{
            shared.waitformessage();

        }
        catch(InterruptedException e){
            e.printStackTrace();
        }

    });
    Thread sender = new Thread(()->{
        try{
            Thread.sleep(1000);
        }
        catch(InterruptedException e){
            e.printStackTrace();
        }
        shared.setmessage("hello student");
    });
    receiver.start();
    Thread.sleep(100);
    sender.start();
    receiver.join();
    sender.join();
    
}}