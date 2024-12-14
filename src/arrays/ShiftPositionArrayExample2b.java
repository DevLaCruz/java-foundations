package arrays;

import java.util.Scanner;

public class ShiftPositionArrayExample2b {
    public static void main(String[] args) {

        int[] a = new int[10];
        int element, position, last;
        Scanner s = new Scanner(System.in);

        for(int i = 0; i < a.length; i++){
            System.out.print("Type a number:");
            a[i] = s.nextInt();
        }
        System.out.println();

        System.out.println("New element:");
        element = s.nextInt();

        System.out.println("Position where you want to add (from 0 to 9)");
        position = s.nextInt();

        last = a[a.length -1];
        for(int i = a.length - 2; i >= position; i--){
            a[i+1] = a[i];
        }
        int[] b = new int[a.length+1];
        System.arraycopy(a, 0, b, 0, a.length);
        a = b;
        a[position] = element;

        a[a.length -1] = last;

        System.out.println("The array:");
        for(int i = 0; i < a.length; i++){
            System.out.println(a[i]);
        }

    }
}
