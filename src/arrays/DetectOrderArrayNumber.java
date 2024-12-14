package arrays;
import java.util.Scanner;

public class DetectOrderArrayNumber {
    public static void main(String[] args) {

        int[] a = new int[7];

        Scanner s = new Scanner(System.in);
        System.out.println("Type 7 numbers:");
        for(int i = 0; i<a.length; i++){
            a[i] = s.nextInt();
        }
        boolean ascendent = false;
        boolean descendent = false;
        for(int i = 0; i < a.length - 1; i++){

            if(a[i] > a[i+1]){
                descendent = true;
            }

            if(a[i] < a[i+1]){
                ascendent = true;
            }
        }

        if(ascendent == true && descendent == true){
            System.out.println("Array = messy");
        }

        if(ascendent == false && descendent == false){
            System.out.println("Array = They are all the same");
        }

        if(ascendent == true && descendent == false){
            System.out.println("Array = Sorted in ascending order ");
        }

        if(ascendent == false && descendent == true){
            System.out.println("Array = Sorted in descending order ");
        }
    }
}
