import java.util.Scanner;

public class PrintTenNoRange {
    //main method
    public static void main(String[] args) {
        // Taking input from user using Scanner Class
        Scanner scanner = new Scanner(System.in); //create scanner object
        System.out.println("Enter the first start value");
        int n = scanner.nextInt(); //using scanner for variable n

        System.out.println("Enter the second value");
        int x = scanner.nextInt(); //using scanner for variable x
        System.out.println("Numbers between first and second values");

        for (int i = n; i<= x; i++) //for-loop syntax
        {
            System.out.println(i);
        }

    }
}
