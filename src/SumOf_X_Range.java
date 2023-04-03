import java.util.Scanner;

public class SumOf_X_Range {
   //main method
    public static void main(String[] args) {
        // Taking input from user using Scanner Class
        Scanner scanner =new Scanner(System.in); //create an object of the scanner class
        System.out.println("Enter the number between 1 to 20 : ");
        int n = scanner.nextInt(); //create obj for n variable using scanner

        if(n<1 || n>20)
        {
            System.out.println("Invalid Input! Please enter a number between 1 to 20:");
        }else
        {
            int sum = 0;   //Declare and Initialize the variable sum to 0
            for (int i = 1; i<=n; ++i) //for-loop syntax
            {
                sum += i;
            }
            System.out.println("The sum of x from 1 to "+ n +" is "+ sum + ".");
        }

    }
}
