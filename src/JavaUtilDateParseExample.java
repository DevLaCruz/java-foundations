import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class JavaUtilDateParseExample {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");

        System.out.println("Type a date in format 'yyyy-MM-dd'");
        try {
            Date date = format.parse(s.next());
            System.out.println("date = " + date);
            System.out.println("format = " + format.format(date));
            
            Date date2 = new Date();
            System.out.println("date2 = " + date2);

            if(date.after(date2)){
                System.out.println("date1 (from the user) is after that date2 (actual)");
            } else if(date.before(date2)){
                System.out.println("date is previous that date2");
            } else if(date.equals(date2)){
                System.out.println("date is equals to date2");
            }

            if(date.compareTo(date2) > 0){
                System.out.println("date1 (from the user) is after that date2 (actual)");
            } else if(date.compareTo(date2) < 0){
                System.out.println("date is previous that date2");
            } else if(date.compareTo(date2) == 0){
                System.out.println("date is equals to date2");
            }

            
        } catch (ParseException e) {
            //e.printStackTrace();
            System.err.println("The date has a incorrect format: " + e.getMessage());
            System.err.println("The format must be 'yyyy-MM-dd'");
            System.exit(1);
            //main(args);
        }
    }
}
