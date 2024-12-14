package arrays;
import java.util.Scanner;

public class ShiftPositionArrayExample2 {
    public static void main(String[] args) {

        int[] a = new int[10];
        int element, position;
        Scanner s = new Scanner(System.in);

        for(int i = 0; i < a.length-1; i++){
            System.out.print("Type a number");
            a[i] = s.nextInt();
        }
        System.out.println();

        System.out.println("New Element:");
        element = s.nextInt();

        System.out.println("Position where you want to add (from 0 to 9)");
        position = s.nextInt();

        for(int i = a.length -2; i >= position; i--){
            a[i+1] = a[i];
        }
        a[position] = element;

        System.out.println("The array:");
        for(int i = 0; i < a.length; i++){
            System.out.println(a[i]);
        }

    }
}
