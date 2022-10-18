import java.util.Scanner;

public class PrimeNumber {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int number = sc.nextInt();

        int count = 0;    //Variable to store number of time given number is evenly divisable

        for (int i=1;i<=number;i++){

            if (number%i==0) { //loop to check if given number is evenly divisable
                count++;        //if evenly divisable, increase the value of this variable
            }
            //below if condition is to check if number is divisable by 1 and number itself that mean by 2 numbers only
        }
        if(count == 2)
        {
            System.out.println(number + " is a prime number.");
        }
        else
        {
            System.out.println(number + " is not a prime number.");
        }
        sc.close();
    }

}


