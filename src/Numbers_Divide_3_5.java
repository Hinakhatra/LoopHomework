public class Numbers_Divide_3_5 {
   //main method
    public static void main(String[] args) {
        System.out.println("\nNumbers Divided by 3: ");
        for (int i=1; i<100; i++)   //for-loop syntax
        {
            if (i%3==0)
                System.out.print(i +", ");
        }
        System.out.println("\n\nNumbers Divided by 5: ");
        for (int i=1; i<100; i++)
        {
            if (i%5==0)
                System.out.print(i +", ");

        }

    }
}
