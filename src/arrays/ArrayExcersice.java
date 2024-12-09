package arrays;

import java.util.Scanner;

public class ArrayExcersice {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int number, arrayNum[];
        arrayNum = new int[10];

        for (number = 0; number < 10; number++) {
            System.out.println("Type a number: ");
            arrayNum[number] = input.nextInt();
        }


        System.out.println("the result is:");
        for (number = 0; number <= 4; number++) {
            System.out.println(arrayNum[9 - number]);
            System.out.println(arrayNum[number]);
        }
    }
}
