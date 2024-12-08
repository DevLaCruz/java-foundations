public class StringValidateExample {
    public static void main(String[] args) {
        
        String course = null;
        
        boolean isNull = course == null;

        System.out.println("isNull = " + isNull);

        if(isNull) {
            course = "Java Development";
        }

        boolean esVacio = course.length() == 0;

        System.out.println("esVacio = " + esVacio);

        boolean isNull2 = course.isEmpty();
        System.out.println("isNull2 = " + isNull2);

        boolean isWhite = course.isBlank();
        System.out.println("isWhite = " + isWhite);

        if(isWhite == false) {
            System.out.println(course.toUpperCase());
            System.out.println("Welcome to the course ".concat(course));
        }
    }
}
