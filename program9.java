public class program9 extends Thread{
public void run(){
    for(int i = 1;i<=5;i++)
        System.out.println(i);
}
public static void main(String[] args) {
    program9 t = new program9();
    t.start();
}
}
