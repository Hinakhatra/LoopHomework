import java.util.Scanner;

public class CalculateSumSeries {
    public static void main(String[] args) {
        double sum = 0;//declare a variable sum to store of the series and initialize it to 0
        // Taking input from user using Scanner Class
        Scanner scanner = new Scanner(System.in);  //create scanner object
        System.out.println("Enter the value of n:");
        int n = scanner.nextInt();  //create obj for n variable using scanner

        for (int i=1; i<=n; i++)    //for-loop syntax
        {
            sum += 1.0/i;
        }
        System.out.println("The sum of the series is: " + sum);
    }
}
