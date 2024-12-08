import java.util.Scanner;

public class SwitchCaseStatement {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Type a number of the month from 1 to 12:");
        int month = s.nextInt();
        String monthName = null;

        switch(month){

            case 1:
                monthName = "January";
                break;
            case 2:
                monthName = "February";
                break;
            case 3:
                monthName = "March";
                break;
            case 4:
                monthName = "April";
                break;
            case 5:
                monthName = "May";
                break;
            case 6:
                monthName = "June";
                break;
            case 7:
                monthName = "July";
                break;
            case 8:
                monthName = "August";
                break;
            case 9:
                monthName = "September";
                break;
            case 10:
                monthName = "October";
                break;
            case 11:
                monthName = "November";
                break;
            case 12:
                monthName = "December";
                break;
            default:
                monthName = "Undefined";
        }

        System.out.println("monthName = " + monthName);

        char num = 'z';

        switch(num){
            case '0':
                System.out.println("The number is zero");
                break;
            case '1':
                System.out.println("The number is one");
                break;
            case '2':
                System.out.println("The number is two");
                break;
            case '3':
                System.out.println("The number is three");
                break;
            case 'a':
                System.out.println("The character is a");
                break;
            default:
                System.out.println("Unknown number or character");
        }

        String name = "juan";

        switch(name){
            case "admin":
                System.out.println("Hello admin, welcome!");
                break;
            case "andres":
                System.out.println("Hello andres!");
                break;
            case "pepe":
                System.out.println("Hello pepe");
                break;
            default:
                System.out.println("Unknown user!");
        }
    }
}
