public class StringConcatenationExample {
    public static void main(String[] args) {
        String course = "Java programming";
        String teacher = "Alejandro De La Cruz";

        String detail = course + " with the teacher " + teacher;
        System.out.println(detail);

        int numberA = 10;
        int numberB = 5;

        System.out.println(detail + (numberA + numberB));

        System.out.println(numberA + numberB + detail);
        
        String detail2 = course.concat(" con ").concat(teacher);
        System.out.println("detail2 = " + detail2);
    }
}
