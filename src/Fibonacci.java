import javafx.scene.transform.Scale;

import java.util.Scanner;

public class Fibonacci {


    public static void main(String[] args) {

        int startnumber=0;      //variable to define start number
        int nextnumber=1;       //variable to add to previous value
        int maxnumber;          //this is to store user input to limit the series

        int sum=0;              //initiated sum with 0 and later will be used to store sum of previos and next value

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the number to print fibonacci series" );
        maxnumber = scanner.nextInt();


        for (int i=1;i<maxnumber;i++){

            System.out.print(startnumber+" ");

            sum=startnumber+nextnumber;         //start value zero and next value 1 will be added to the int sum
            startnumber=nextnumber;             //value of start number will become last value of previous sum
            nextnumber=sum;                     //sum of previous digits will become next number

        }
    }

}
