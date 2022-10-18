import java.util.Scanner;

public class SumOf5DigitNumber {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the 5 digit number : ");

        int number = scanner.nextInt();
        int remainder;       //local variable to store remainder using modular operator
        int total = 0;      //this variable will be used to add remainder for each loop run, currently initialised with the value 0

        if (number<=9999 || number>=99999) //if condition to check if user is entering 5 digits only
        {
            System.out.println("Please enter 5 digit numbers only");
        }
        else
        {

            while (number > 0) {

                remainder = number % 10;         //this will return last digit each time
                total = total + remainder;       //adding last digit to the total each time

                number = number / 10;           //this will remove last digit from the given number so rest number can be used with modulas operator to catch last digit and add it to the variable total


            }
            System.out.println("The sum of each entered digit is : " + total);
        }
    }
}