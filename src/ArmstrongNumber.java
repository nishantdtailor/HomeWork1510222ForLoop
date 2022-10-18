import java.util.Scanner;

public class ArmstrongNumber {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter 3 digit number to check if it is Armstrong number or not : ");
        int number = scanner.nextInt();
        int originalNumber, result = 0;

        originalNumber=number;

        if (number<100 || number>999)
        {
            System.out.println("Please enter 3 digit number");
        }
        else {

            while (number>0){
                result=result+(number%10)*(number%10)*(number%10);
                number=number/10;
            }
            if (result == originalNumber)
                System.out.println(originalNumber + " is an Armstrong number.");
            else
                System.out.println(originalNumber + " is not an Armstrong number.");
        }
    }
}