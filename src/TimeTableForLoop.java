import java.util.Scanner;

public class TimeTableForLoop {
    //main method
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);//create scanner object
        System.out.println("Enter any number to print table for that number"); //Taking input from user
        int n = scanner.nextInt();  //create obj for n variable using scanner

        for (int i =1;i<=12;i++){   //for loop syntax

            System.out.println(n +" x "+i+" = "+n*i); //print multiplication table for any number
        }

    }
}