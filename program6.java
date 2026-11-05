import java.util.Scanner;

public class program6 {
    static void checkmarks(int marks){
        if(marks<0 || marks>100)
            throw new RuntimeException("invalid marks");
        else
            System.out.println("valid marks");

    }
public static void main(String[]args)
{
    Scanner sc = new Scanner(System.in);
      System.out.println("enter the marks");
int marks = sc.nextInt();
try{
    checkmarks(marks);
}
catch(RuntimeException e )
{
  System.out.println(e.getMessage());
}sc.close();
}}
   