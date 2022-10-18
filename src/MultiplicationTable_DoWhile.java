public class MultiplicationTable_DoWhile {

    public static void main(String[] args) {

        int i=1;
        do {
            int j =1;
            do {
                System.out.print(i * j + "\t");
                j++;
            }while ((j<=3));
            i++;
            System.out.println();
        }while (i<=7);
    }
}