import java.util.Scanner;
public class Program1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the first no:");
        int a =sc.nextInt();
        System.out.println("enter the second no:");
        int b = sc.nextInt();
        try{
            int result = a/b;
            System.out.println("result:" + result);
        }
        catch(ArithmeticException e){
            System.out.println("exception found");
        }
        sc.close();

    }
}
        