public class InstanceOfGenericTypesOperators {
    public static void main(String[] args) {

        Object text = "Create an object of the String class ... Whats up!";

        Number num = Integer.valueOf(7); // 7;

        Boolean b1 = text instanceof String;

        System.out.println("text is of String type = " + b1);

        b1 = text instanceof Object;
        System.out.println("text is of Object type = " + b1);

        b1 = text instanceof Integer;
        System.out.println("text is of Integer type = " + b1);

        b1 = num instanceof Integer;
        System.out.println("num is of Integer type = " + b1);

        b1 = num instanceof Number;
        System.out.println("num is of Number type = " + b1);

        b1 = num instanceof Object;
        System.out.println("num is of Object type = " + b1);

        b1 = num instanceof Long;
        System.out.println("num is of Long type = " + b1);

        b1 = num instanceof Double;
        System.out.println("num is of Double type = " + b1);

        Number decimal = Float.valueOf(45.54f);
        b1 = decimal instanceof Double;
        System.out.println("decimal is of Double type = " + b1);

        b1 = decimal instanceof Float;
        System.out.println("decimal is of Float type = " + b1);

        b1 = decimal instanceof Integer;
        System.out.println("decimal is of Integer type = " + b1);

        b1 = decimal instanceof Number;
        System.out.println("decimal is of Number type = " + b1);

        b1 = b1 instanceof Boolean;
        System.out.println("b1 is of Boolean type = " + b1);
    }
}
