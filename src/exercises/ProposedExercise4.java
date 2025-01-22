package exercises;

import java.util.Scanner;

public class ProposedExercise4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Type a number 1: ");
        int num1 = scanner.nextInt();

        System.out.println("Type a number 2: ");
        int num2 = scanner.nextInt();

        String result = (num1 > num2) ? num1 + " y " + num2 : num2 + " y " + num1;

        System.out.println("The order is: " + result);

    }
}
