import java.util.Scanner;

public class PrimeNumber {
   //main method
    public static void main(String[] args) {
        int count = 0;   //Declare and Initialize the variable count to 0
        // Taking input from user using Scanner Class
        Scanner scanner = new Scanner(System.in); //create scanner object
        System.out.println("Enter a number to check if it is prime number or not :");
        int n = scanner.nextInt();  //create obj for n variable using scanner
        

        for (int i=1; i<=n; i++)    //for-loop syntax
        {
            if (n%i==0)
            {
                count++;
            }
        }
        if (count==2)
        {
            System.out.println("Given number is a prime number");
        }
        else
        {
            System.out.println("Given number is not a prime number");
        }
    }
}
