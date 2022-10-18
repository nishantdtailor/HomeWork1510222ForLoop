import java.util.Scanner;

public class Factorial {


    public static void main(String args[]){
        int fact=1;

        Scanner scanner= new Scanner(System.in);

        System.out.println("Please enter the number to find the factorial : ");

        int number = scanner.nextInt();


        for(int i=1;i<=number;i++){

            fact=fact*i;
        }
        System.out.println("Factorial of "+number+" is: "+fact);
    }
}
