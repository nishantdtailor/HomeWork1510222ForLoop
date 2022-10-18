import java.util.Scanner;

public class SumOfNaturalNumbers {



        public static void main(String[] args)
        {

            Scanner scanner = new Scanner(System.in);

            System.out.println("Please the end number to calculate sum of natural numbers : ");

            int number = scanner.nextInt();

            int sum = 0;

            for(int i = 1; i <= number; ++i)
            {

                sum = sum + i;
            }

            System.out.println("Sum of Natural Numbers is = " + sum);
        }
    }



