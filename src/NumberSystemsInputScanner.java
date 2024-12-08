import java.util.InputMismatchException;
import java.util.Scanner;

public class NumberSystemsInputScanner {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input un integer number:");
        // String numeroStr = scanner.nextLine();
        int decimalNumber = 0;
        try {
            decimalNumber = scanner.nextInt();// Integer.parseInt(numeroStr);
        } catch (InputMismatchException e){
            System.out.println("Error, You must enter an integer!");
            main(args);
            System.exit(0);
        }

        System.out.println("decimalNumber = " + decimalNumber);

        String binaryResult = "binary number de " + decimalNumber + " = " + Integer.toBinaryString(decimalNumber);
        String octalResult = "octal number de " + decimalNumber + " = " + Integer.toOctalString(decimalNumber);
        String hexadecimalResult = "hexadecimal number " + decimalNumber + " = " + Integer.toHexString(decimalNumber);
        
        String message = binaryResult;
        message += "\n" + octalResult;
        message += "\n" + hexadecimalResult;

        System.out.println(message);
    }
}
