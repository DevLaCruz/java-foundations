import java.util.Scanner;

public class NumDayMonthIfElseStatement {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Type a number of the month of 1 - 12");
        int month = s.nextInt();

        int numDays = 0;
        System.out.println("Type the year (YYYY)");
        int years = s.nextInt();

        if(month == 1 || month ==3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12){
            numDays = 31;
        } else if(month == 4 || month == 6 || month == 9 || month == 11){
            numDays = 30;
        } else if(month == 2){
            if(years % 400 == 0 || ( (years % 4 == 0) && !(years % 100 == 0))){
                numDays = 29;
            } else {
                numDays = 28;
            }
        }
        System.out.println("numDays = " + numDays);
    }
}
