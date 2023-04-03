import java.util.Scanner;

public class CalculatorSwitch {
    public static void main(String[] args) {
        char operator;
        double number1, number2, result;
        //create an object of scanner class
        Scanner scanner =new Scanner(System.in);

        //ask user to enter numbers
        System.out.println("Enter the First number");
        number1 = scanner.nextDouble();     //create obj for number1 variable using scanner

        //ask user to enter operator
        System.out.println("Choose an operator from:+,-,*,/");
        operator = scanner.next().charAt(0); //create obj for operator variable using scanner

        //ask user to enter number
        System.out.println("Enter the Second number");
        number2 = scanner.nextDouble();     //create obj for number2 variable using scanner

        switch (operator){

            //performs addition between numbers
            case '+':
                result = number1 + number2;
                System.out.println(number1 + " + " + number2 + " = " + result );
                break;
            //performs subtraction between numbers
            case '-':
                result = number1 - number2;
                System.out.println(number1 + " - " + number2 + " = " + result );
                break;
            //performs multiplication between numbers
            case '*':
                result = number1 * number2;
                System.out.println(number1 + " * " + number2 + " = " + result );
                break;
            //performs division between numbers;
            case '/':
                result = number1 / number2;
                System.out.println(number1 + " / " + number2 + " = " + result );
                break;
            default:
                System.out.println("Invalid operator!");


        }






    }
}
