import java.util.Scanner;

public class ReverseNumberForLoop {
   //main method
    public static void main(String[] args) {
        int num,reminder,i;     //Declare the variables
        Scanner scanner =new Scanner(System.in); //create scanner object
        System.out.println("Enter the number");  //Taking input from user
        num =scanner.nextInt();    //create obj for num variable using scanner
        System.out.println("Before reverse: " +num);

        for (i=0 ;num>0;num=num/10 ) //num=2345//second time i value is 5
        {
            reminder = num%10;      //2345%10=5 first time
            i = i*10+reminder;      //i value 0 = 0*10+5=5
        }
        System.out.println("After Reverse of specified number is: "+i);
    }
}
