import java.util.Scanner;
//main method
public class FibonacciSequence {
   //main method
    public static void main(String[] args) {
        int maxnumber = 0;      //Declare and Initialize the variables
        int previousnumber = 0;
        int nextnumber= 1;
        System.out.println("Enter the number for Fibonacci sequence:  ");//Taking input from user
        Scanner scanner = new Scanner(System.in); //create an object of the scanner class
        maxnumber = scanner.nextInt();//create obj for maxnumber variable using scanner
        System.out.println("Fibonacci sequence of : " +maxnumber);

        for (int i=1; i<=maxnumber; ++i)   //for-loop syntax
        {
            System.out.println(previousnumber+" ");
            int sum = previousnumber+nextnumber;
            previousnumber = nextnumber;
            nextnumber = sum;
        }


    }
}
