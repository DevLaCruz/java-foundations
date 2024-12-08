import java.util.Scanner;

public class SwitchCaseNumDaysInMonth {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Enter the month number from 1 to 12");
        int month = s.nextInt();

        int numberOfDays = 0;
        System.out.println("Enter the year (YYYY)");
        int year = s.nextInt();

        switch(month){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                numberOfDays = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                numberOfDays = 30;
                break;
            case 2:
                if(year % 400 == 0 || ((year % 4 == 0) && !(year % 100 == 0))){
                    numberOfDays = 29;
                } else {
                    numberOfDays = 28;
                }
                break;
            default:
                numberOfDays = 0;
        }

        System.out.println("numberOfDays = " + numberOfDays);
    }
}
