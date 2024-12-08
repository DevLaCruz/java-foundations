import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class JavaUtilCalendarExample {
    public static void main(String[] args) {

        Calendar calendary = Calendar.getInstance();

        //calendary.set(2019, Calendar.SEPTEMBER, 25, 18, 20, 10);
        calendary.set(Calendar.YEAR, 2020);
        calendary.set(Calendar.MONTH, Calendar.MARCH);
        calendary.set(Calendar.DAY_OF_MONTH, 25);

        //calendary.set(Calendar.HOUR_OF_DAY, 21);
        calendary.set(Calendar.HOUR, 7);
        calendary.set(Calendar.AM_PM, Calendar.PM);
        calendary.set(Calendar.MINUTE, 20);
        calendary.set(Calendar.SECOND, 10);
        calendary.set(Calendar.MILLISECOND, 125);

        Date date = calendary.getTime();
        System.out.println("date without format = " + date);

        SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS a");
        String dateConFormato = formato.format(date);
        System.out.println("date with Format = " + dateConFormato);

        Calendar calActual = Calendar.getInstance();
        Date date2 = calActual.getTime();

        if(date.after(date2)){
            System.out.println("date1 (from the user) is after that date2 (current)");
        } else if(date.before(date2)){
            System.out.println("date is before that date2");
        } else if(date.equals(date2)){
            System.out.println("date is equal to date2");
        }

        if(date.compareTo(date2) > 0){
            System.out.println("date1 (from the user) is after that date2 (current)");
        } else if(date.compareTo(date2) < 0){
            System.out.println("date is before that date2");
        } else if(date.compareTo(date2) == 0){
            System.out.println("date is equal to date2");
        }

    }
}
