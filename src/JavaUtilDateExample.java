import java.text.SimpleDateFormat;
import java.util.Date;

public class JavaUtilDateExample {
    public static void main(String[] args) {

        Date date = new Date();

        System.out.println("date = " + date);

        SimpleDateFormat df = new SimpleDateFormat("EEEE dd 'de' MMMM, yyyy");
        String dateStr = df.format(date);

        long j = 0;
        for(int i = 0; i < 100000000; i++){
            j +=i;
        }
        System.out.println("j = " + j);

        Date date2 = new Date();
        long finallyTime = date2.getTime() - date.getTime();
        System.out.println("Elapsed time in the for = " + finallyTime);
        System.out.println("dateStr = " + dateStr);
    }
}
