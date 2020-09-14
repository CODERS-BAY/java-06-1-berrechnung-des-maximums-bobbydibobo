import java.util.Arrays;
import java.util.Scanner;

public class MaxNum{

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] yourNumbers = new int[0];

        System.out.println("Choose some numbers! (quit by pressing 'q')");

        while (!scan.hasNext("q")) {

            int chosenNumber = scan.nextInt();
            int[] tempNumbers = new int[yourNumbers.length + 1];

            for (int i = 0; i < yourNumbers.length; i++) {
                tempNumbers[i]=yourNumbers[i];
            }
            tempNumbers[tempNumbers.length - 1] = chosenNumber;
            yourNumbers = tempNumbers;

            System.out.println(Arrays.toString(yourNumbers));
        }

        int max = yourNumbers[0];
        for (int i = 1; i < yourNumbers.length; i++) {
            if (yourNumbers[i] > max) {
                max = yourNumbers[i];
            }
        }
        System.out.println("The highest number is: " + max);
    }
}
