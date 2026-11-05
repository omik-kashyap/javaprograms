public class program15 {
    static class firstThread extends Thread{
        public void run(){
            for(int i = 0;i<3;i++)
                System.out.println("first thread:");
    }
    
    }
static class secondThread extends Thread{
    public void run(){
        for(int i =0;i<3;i++)
        System.out.println("second thread");
    }
}
public static void main(String[]args) throws InterruptedException {
    firstThread t1 = new firstThread();
    secondThread t2 = new secondThread();
    t1.start();
    t1.join();
    t2.start();
    t2.join();

}
}
