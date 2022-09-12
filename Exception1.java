import java.util.Scanner;

public class Exception1 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter 2 numbers ");
        division();
    }

    static void division()
    {
        Scanner in=new Scanner(System.in);
        try {
            int num1=in.nextInt();
            int num2=in.nextInt();
            int result = num1 / num2;
            System.out.println("Result is " + result);
        }
        catch (ArithmeticException e)
        {
            System.out.println("You Cannot divide a number by 0");
        }
    }
}