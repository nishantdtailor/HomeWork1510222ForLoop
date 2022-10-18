import java.util.Scanner;

public class Print10Numbers {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the first number to print 10 numbers between 2 numbers :");

        int firstnumber = scanner.nextInt();

        System.out.println("Please enter the last number to print 10 numbers between 2 numbers :");

        int lastnumber = scanner.nextInt();

        if (firstnumber+9!=lastnumber){     //if condition to check user has entered correct range

            System.out.println("Please Enter the correct input range !! ");

        }
        else
        {
            for (int i=firstnumber;i<=lastnumber;i++){

                System.out.println(i);

            }

        }



    }

}
