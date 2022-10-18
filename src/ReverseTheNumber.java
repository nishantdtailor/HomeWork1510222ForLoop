import java.util.Scanner;

public class ReverseTheNumber {


    public static void main(String args[]){
        int remainder;      // variable to store remainder
        int total=0;        // variable to store total in reverse order
        int temp;           // temp variable to store user input before performing any operation on it

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the number : ");

        int number = scanner.nextInt();

        temp=number;    //storing user input into temporary variable for comparison at later stage

        while(number>0){

            remainder=number%10;  //this will get remainder of the current value of number
            total=(total*10)+remainder;  // total is multiplying by 10 + adding remainder to reverse the order
            number = number /10;    //value of number
        }

        System.out.println("The reversed of the entered number is : "+total);

    }
}
