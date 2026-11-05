public class program10 implements Runnable {
    public void run(){
        for(int i=1 ;i <=3; i++)
            System.out.println("hello student");
    }
    public static void main(String[]args) throws InterruptedException       {

    Thread t =new Thread(new program10());
    t.start();
    t.join();
  System.out.println("complete");  
 
    
}}
