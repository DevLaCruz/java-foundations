import java.util.Scanner;

public class TernaryOperator {
    public static void main(String[] args) {
        
        String variable = 7 == 5 ? "if it is true" : "if it is false";
        System.out.println("variable = " + variable);
        
        String status = "";
        double average = 0.0;

        double maths = 0.0;
        double sciences = 0.0;
        double history = 0.0;

        Scanner s = new Scanner(System.in);

        System.out.println("Enter the math grade between 2.0 and 7.0:");
        maths = s.nextDouble();

        System.out.println("Enter the math grade between 2.0 - 7.0:");
        sciences = s.nextDouble();

        System.out.println("Enter the math grade between 2.0 - 7.0:");
        history = s.nextDouble();

        average = (maths + sciences + history) / 3;
        System.out.println("average = " + average);

        status = average >= 5.49 ? "Approved": "Refused";
        System.out.println("status = " + status);

       /* if(promedio >= 5.49){
            estado = "Aprobado";
        } else {
            estado = "Rechazado";
        }*/
    }
}
