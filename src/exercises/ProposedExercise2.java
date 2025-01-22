package exercises;

import java.util.Scanner;

public class ProposedExercise2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Type a invoice name:");
        String name = scanner.nextLine();

        System.out.println("Type a product price:");
        double price1 = scanner.nextDouble();

        System.out.println("Type a second product price:");
        double price2 = scanner.nextDouble();

        double grossTotal = price1 + price2;
        double tax = grossTotal * 0.19;
        double netTotal = grossTotal + tax;

        String detail = "The invoice " + name + " has a gross total of " + grossTotal
                + ", with tax of " + tax
                + " and the mount after of tax is " + netTotal;

        System.out.println(detail);
    }
}
