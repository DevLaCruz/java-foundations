public class StringExample {
    public static void main(String[] args) {
        String course = "Java Development";
        String course2 = new String("Java Development");
        
        boolean isEqual = course == course2;
        System.out.println("course == course2 = " + isEqual);
        
        isEqual = course.equals(course2);
        System.out.println("course.equals(course2) = " + isEqual);

        String course3 = "Java Development";
        isEqual = course == course3;
        System.out.println("course == course3 = " + isEqual);

    }
}
