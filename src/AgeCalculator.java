import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class AgeCalculator {
    public static void main(String[] args) throws ParseException {

        Scanner sc = new Scanner(System.in);

        System.out.println("Type your born day in format MM-dd-yyyy: ");
        String inputBornDateStr=sc.next();

        System.out.println("For now, the data type of what you just wrote is: "+inputBornDateStr.getClass().getName());

        System.out.println("Working...");
        DateFormat df = new SimpleDateFormat("MM-dd-yyyy");
        Date inputBornDate= df.parse(inputBornDateStr);
        Date now =new Date();


        System.out.println("Now what you wrote now is: "+inputBornDate+", and the data type is: "+inputBornDate.getClass().getName());

        df=new SimpleDateFormat("yyyyMMdd");

        int from =Integer.parseInt(df.format(inputBornDate));
        int to=Integer.parseInt(df.format(now));

        int age=(to - from)/10000;
        System.out.println("this is a from: "+from+"& to: "+to+" age: "+age);

        System.out.println("You're have "+age+" years old");

    }
}
