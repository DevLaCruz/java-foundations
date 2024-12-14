package arrays;
import java.util.Scanner;

public class ShiftPositionArrayExample3 {
    public static void main(String[] args) {

        int[] a = new int[7];
        int number, position;

        Scanner s = new Scanner(System.in);

        for(int i = 0; i < a.length - 1; i++){
            System.out.print("Type a number:");
            a[i] = s.nextInt();
        }
        System.out.println();

        System.out.println("Type a number to insert:");
        number = s.nextInt();

        position = 0;
        while(position < 6 && number > a[position]){
            position++;
        }

        for(int i = a.length - 2; i >= position; i--){
            a[i+1] = a[i];
        }

        a[position] = number;
        System.out.println("The new orderly array:");
        for(int i = 0; i < a.length; i++){
            System.out.println(i + " => " + a[i]);
        }

    }
}
