package arrays;
import java.util.Scanner;

public class EvenOddArraysExample {
    public static void main(String[] args) {

        int[] a, even, odd;
        int totalEven = 0, totalOdd = 0;
        a = new int[10];
        Scanner s = new Scanner(System.in);

        System.out.println("Ingrese 10 números:");
        for(int i = 0; i < a.length; i++){
            a[i] = s.nextInt();
        }

        for(int i = 0; i < a.length;i++){

            if(a[i]%2 == 0){
                totalEven++;
            } else {
                totalOdd++;
            }
        }
        even = new int[totalEven];
        odd = new int[totalOdd];

        int j = 0;
        int k = 0;
        for(int i = 0; i < a.length; i++){
            if(a[i] % 2 == 0){
                even[j++] = a[i];
            } else {
                odd[k++] = a[i];
            }
        }

        System.out.println("even");
        for(int i = 0; i < even.length; i++){
            System.out.print(even[i] + " ");
        }

        System.out.println("\r\nodd");
        for(int i = 0; i < odd.length; i++){
            System.out.print(odd[i] + " ");
        }
        System.out.println();
        
    }
}
