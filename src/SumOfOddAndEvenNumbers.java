import java.util.Scanner;

public class SumOfOddAndEvenNumbers {

    public static void main(String[] args) {

        int sumOfOdd=0;     //Variable to store total of odd digits
        int sumOfEven=0;    //Variable to store total of even digits
        int remainder;       //variable to store remainder using modular operator
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter 5 digits number : ");
        int number = scanner.nextInt();

        if (number<=9999 || number>=99999){     //if condition to check if user is inputting 5 digit numbers

            System.out.println("Please enter 5 digits number !!");
        }
        else {

            while (number!=0){          //while loop until number value reached to 0

                remainder=number%10;

                if (remainder%2==0){     //if condition to check of the last digit is even or odd

                    sumOfEven=sumOfEven+remainder;       //add(sum) to this variable if even number
                }
                else {
                    sumOfOdd=sumOfOdd+remainder;         //add(sum) to this variable if odd number
                }

                number=number/10;                       //removes last digit from current value of number
            }

            System.out.println("Sum of odd digits : "+sumOfOdd);
            System.out.println("Sum of even digits : "+sumOfEven);

        }

    }

}
