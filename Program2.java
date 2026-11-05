import java.util.Scanner;
public class Program2{
    public static void main(String[] args){
        int[]arr = {10,20,30,40,50};
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the element:");
        int p = sc.nextInt();
        try{
            System.out.println("result" + arr[p]);

        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("error");

        }
        sc.close();

    }
}

