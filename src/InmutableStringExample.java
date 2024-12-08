public class InmutableStringExample {
    public static void main(String[] args) {
        String course = "Java Development";
        String teacher = "Alejandro De La Cruz";

        String result = course.concat(teacher);
        System.out.println("course = " + course);
        System.out.println("result = " + result);
        System.out.println(course == result);

        String result2 = course.transform(c -> {
            return c + " with " + teacher;
        });
        
        System.out.println("course = " + course);
        System.out.println("result2 = " + result2);

        String result3 = result.replace("a", "A");

        System.out.println("result = " + result);
        System.out.println("result3 = " + result3);
    }
}
