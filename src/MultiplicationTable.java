import java.util.Scanner;

public class MultiplicationTable {


        public static void main(String[] args)
        {

            Scanner scanner = new Scanner(System.in);

            System.out.println("Please enter the number to print multiplication table : ");

            int num = scanner.nextInt();

            for (int i = 1; i <= 10; i++) {         //limiting boolean to 10

                System.out.println(num + " x " + i + " = "  + (num * i));   //simply multiplying i value with user inputted value for 10 times with increament by 1

            }
        }



}




