import java.util.Scanner;

public class CircularArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the radio: ");
        double radius = input.nextDouble();

        double area = Math.PI * Math.pow(radius, 2);

        System.out.println("The area of the circular area is " + area);
    }
}
