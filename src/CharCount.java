import java.util.Scanner;

public class CharCount {

    public static void main(String[] args) {

        String sentence;                // Variable to store user input
        int count=0;                    // to count the occurance of particular character

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the sentence ");
        sentence = scanner.nextLine();

        for (int i=0;i<sentence.length();i++){      //for loop until the length of the entered sentence

            if (sentence.charAt(i)=='a'){   //charAT return the value of the character at the index of i and compare if its equal to 'a'
                count++;
            }

        }
        System.out.println("The number of 'a' in the entered sentence is :"+count);

    }


}
