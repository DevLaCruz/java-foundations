public class InstanceOfOperator {
    public static void main(String[] args) {

        String text = "Create a object of the String class ... Whats up!";

        Integer num = 7;

        Boolean b1 = text instanceof String;

        System.out.println("text is of String type = " + b1);

        b1 = text instanceof Object;
        System.out.println("text is of Object type = " + b1);

        b1 = num instanceof Integer;
        System.out.println("num is of Integer type = " + b1);

        b1 = num instanceof Number;
        System.out.println("num is of Number type = " + b1);

        b1 = num instanceof Object;
        System.out.println("num is of Object type = " + b1);

        Double decimal = 45.54;
        b1 = decimal instanceof Number;
        System.out.println("decimal is of Number type = " + b1);

        b1 = b1 instanceof Boolean;
        System.out.println("b1 is of Boolean type = " + b1);
    }
}
