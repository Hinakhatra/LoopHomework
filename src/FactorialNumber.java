import java.util.Scanner;

public class FactorialNumber {
    public static void main(String[] args) {
        int fact = 1;     //Declare and Initialize the variable fact to 1
        // Taking input from user using Scanner Class
        Scanner scanner =new Scanner(System.in); //create an object of the scanner class
        System.out.println("Enter the number to calculate its factorial:");
        int num = scanner.nextInt();  //create obj for num variable using scanner

        if(num<0)
        {
            System.out.println("Number should be non-negative;");
        }
        else
        {
        for (int i=1;i<=num;i++)  //if put num=5 and i=1
        fact = fact*i; //output is 1*2*3*4*5=120

        System.out.println("Factorial of "+num+" is = "+fact);

        }
    }

}
