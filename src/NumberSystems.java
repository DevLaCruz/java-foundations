import javax.swing.*;

public class NumberSystems {
    public static void main(String[] args) {

        String numberStr = JOptionPane.showInputDialog(null, "Type a integer number");
        int decimalNumber = 0;
        try {
            decimalNumber = Integer.parseInt(numberStr);
        } catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Error, you must type integer number");
            main(args);
            System.exit(0);
        }

        System.out.println("decimalNumber = " + decimalNumber);

        String binaryResult = "binary number of " + decimalNumber + " = " + Integer.toBinaryString(decimalNumber);
        System.out.println(binaryResult);

        int binaryNumber = 0b11110;
        System.out.println("binaryNumber = " + binaryNumber);

        String octalResult = "octal number of " + decimalNumber + " = " + Integer.toOctalString(decimalNumber);
        System.out.println(octalResult);
        int octalNumber = 036;
        System.out.println("octalNumber = " + octalNumber);

        String hexadecimalResult = "hexadecimal number of " + decimalNumber + " = " + Integer.toHexString(decimalNumber);
        System.out.println(hexadecimalResult);
        int hexadecimalNumber = 0x1e;
        System.out.println("hexadecimalNumber = " + hexadecimalNumber);

        String message = binaryResult;
        message += "\n" + octalResult;
        message += "\n" + hexadecimalResult;

        JOptionPane.showMessageDialog(null, message);
    }
}
