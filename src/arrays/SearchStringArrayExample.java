package arrays;
import java.util.Scanner;

public class SearchStringArrayExample {
    public static void main(String[] args) {

        String[] a = new String[4];

        Scanner s = new Scanner(System.in);

        for(int i = 0; i < a.length; i++){
            System.out.print("Type a name: ");
            a[i] = s.next();
        }

        System.out.println("\r\nIType a name to search:");
        String name = s.next();
        int i = 0;
        for(; i < a.length && !a[i].equalsIgnoreCase(name); i++){}

        if(i == a.length){
            System.out.println("Number not found");
        } else if(a[i].toLowerCase().compareTo(name.toLowerCase()) == 0){
            System.out.println("Found in the position: " + i);
        }
    }
}
