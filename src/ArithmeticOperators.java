import javax.swing.*;

public class ArithmeticOperators {
    public static void main(String[] args) {

        int i = 5, j = 4, suma = i + j;

        System.out.println("addition = " + suma);

        System.out.println("i + j = " + (i + j));
        
        int subtraction = i - j;
        System.out.println("subtraction = " + subtraction);
        System.out.println("(i - j) = " + (i - j));

        int multi = i * j;
        System.out.println("multiplication = " + multi);
        
        int div = i / j;
        float div2 = (float) i / (float)j;
        System.out.println("div = " + div);
        System.out.println("div2 = " + div2);
        
        int rest = i % j;
        System.out.println("rest = " + rest);

        rest = 8 % 5;
        System.out.println("rest = " + rest);

        int number = Integer.parseInt(JOptionPane.showInputDialog("Type a number"));
        if(number % 2 == 0){
            System.out.println("number pair = " + number);
        } else {
            System.out.println("number odd = " + number);
        }
    }
}
