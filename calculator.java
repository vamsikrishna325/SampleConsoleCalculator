import java.util.*;
public class calculator
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (true) 
        { 
        System.out.println("Enter 1 for addition");
        System.out.println("Enter 2 for subtraction");
        System.out.println("Enter 3 for multiplication");
        System.out.println("Enter 4 for division");
        System.out.println("Enter -1 for exit");
        System.out.println("===========================");
        System.out.print("Enter number = ");
        int n=sc.nextInt();
        if(n==-1)
          break;
        else
        {
         System.out.print("Enter a value = ");
         long a=sc.nextInt();
         System.out.print("Enter b value = ");
         long b=sc.nextInt();
        switch(n)
        {
            case 1:System.out.println("Result = "+calculation.addition(a,b));
                   System.out.println();break;

            case 2:System.out.println("Result = "+calculation.substraction(a, b));
                   System.out.println();break;
            case 3:System.out.println("Result = "+calculation.multiplication(a, b));
                   System.out.println();break;
            case 4:System.out.println("Result = "+calculation.division(a, b));
                   System.out.println();break;
            default :System.out.println("Enter number between 1-4");
        }


        }


        }

    }
}

class calculation
{
  public static long addition(long a,long b)
  {
    return a+b;
  }
  public static long substraction(long a,long b)
  {
    return a-b;
  }
  public static long multiplication(long a,long b)
  {
    return a*b;
  }
  public static double division(long a,long b)
  {
   
    try
    {
        return a/b;
    }
    catch(ArithmeticException e)
    {
        System.out.println("Error: Division by zero is not allowed!");
    }
    return 0;
  }
}