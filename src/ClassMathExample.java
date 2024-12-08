public class ClassMathExample {
    public static void main(String[] args) {
        
        int absolute = Math.abs(-3);
        System.out.println("absolute = " + absolute);
        
        absolute = Math.abs(3);
        System.out.println("absolute = " + absolute);
        
        double max = Math.max(3.5, 1.2);
        System.out.println("max = " + max);
        
        double min = Math.min(3.5, 1.2);
        System.out.println("min = " + min);
        
        double roof = Math.ceil(3.5);
        System.out.println("roof = " + roof);
        
        double floor = Math.floor(3.5);
        System.out.println("floor = " + floor);
        
        long integer = Math.round(Math.PI);
        System.out.println("integer = " + integer);
        
        double exp = Math.exp(1);
        System.out.println("exp = " + exp);
        
        double log = Math.log(10);
        System.out.println("log = " + log);
        
        double power = Math.pow(10, 3);
        System.out.println("power = " + power);
        
        double root = Math.sqrt(5);
        System.out.println("root = " + root);

        double degrees = Math.toDegrees(1.57);
        degrees = Math.round(degrees);
        System.out.println("convert radians a degrees = " + degrees);

        double radians = Math.toRadians(90.00);
        System.out.println("convert degrees a radians = " + radians);

        System.out.println("sin(90): " + Math.sin(radians));
        System.out.println("cos(90): " + Math.cos(radians));

        radians = Math.toRadians(180.00);
        System.out.println("cos(180): " + Math.cos(radians));

        radians = Math.toRadians(0.00);
        System.out.println("cos(0): " + Math.cos(radians));

    }
}
