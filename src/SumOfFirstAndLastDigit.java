import java.util.Scanner;

public class SumOfFirstAndLastDigit {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the 5 digit number : ");

        int number = scanner.nextInt();
        int remainer;       //local variable to store remainder using modular operator
        int total = 0;      //this variable will be used to add remainder for each loop run, currently initialised with the value 0

        if (number<=9999 || number>=99999) //if condition to check if user is entering 5 digits only
        {
            System.out.println("Please enter 5 digit numbers only");
        }
        else
        {

            while (number > 0) {

                remainer = number % 10;         //this will return last digit (remainder) each time
                total = total + remainer;       //adding first and last digit to the total

                number = number / 10;           //this will remove last digit from the given number so rest number can be used with modular operator to catch last digit and add it to the variable total
                number = number / 10;           // removing last digit out of 4
                number = number / 10;           //removing last digit out of 3
                number = number / 10;           // removing last digit out of 2 and leaving only last remained digit



            }
            System.out.println("The sum of each entered digit is : " + total);
        }
    }

}
