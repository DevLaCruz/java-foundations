package arrays;
import java.util.Scanner;

public class FindNumberArrayExample {
    public static void main(String[] args) {

        int[] a = new int[10];

        Scanner s = new Scanner(System.in);

        for(int i = 0; i < a.length; i++){
            System.out.print("Type a number: ");
            a[i] = s.nextInt();
        }

        System.out.println("\r\nType a number to search:");
        int num = s.nextInt();
        int i = 0;
        for(; i < a.length && a[i] != num; i++){}

        if(i == a.length){
            System.out.println("Number not found");
        } else if(a[i] == num){
            System.out.println("Found in the position: " + i);
        }
    }
}
