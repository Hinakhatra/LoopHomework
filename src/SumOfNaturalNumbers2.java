import java.util.Scanner;

public class SumOfNaturalNumbers2 {
    //main method
    public static void main(String[] args) {
        int num;//Declare the number
        int sum=0;//variable to calculate the sum
        // Taking input from user using Scanner Class
        Scanner scanner =new Scanner(System.in); //create an object of scanner class
        System.out.println("Enter the number");
        num=scanner.nextInt();  //create obj for num variable using scanner

        for (int i=1;i<=num;i++) //if put num=6 and i=1
        {
            sum=sum+i;   //output should be 1+2+3+4+5+6=21
        }
        System.out.println("The sum of natural number is "+sum);
    }
}

