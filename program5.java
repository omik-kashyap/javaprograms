import java.util.Scanner;

public class program5 {
static  void checkEligibility(int age){

    if (age < 18)
        throw new  RuntimeException("not eligible to vote:");
    else
        System.out.println("eligible to vote");
}
public static void main(String[]args)
{
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the age:");
    int age = sc.nextInt();
    try{
        checkEligibility(age);
    }
    catch(RuntimeException e){
        System.out.println(e.getMessage());
    }
    sc.close();
}
}
   