public class FloatPrimitives {
    public static void main(String[] args) {

        float realFloat = 0.00000000015f; //1.5e-10f;
        System.out.println("realFloat = " + realFloat);
        System.out.println("float corresponds in byte to = " + Float.BYTES);
        System.out.println("float corresponds in bytes to = " + Float.SIZE);
        System.out.println("max value of a float = " + Float.MAX_VALUE);
        System.out.println("min value of a float = " + Float.MIN_VALUE);
        
        double realDouble = 3.4028235E39;
        System.out.println("realDouble = " + realDouble);

        System.out.println("double corresponds in byte to = " + Double.BYTES);
        System.out.println("double corresponds in bytes to = " + Double.SIZE);
        System.out.println("max value of a float = " + Double.MAX_VALUE);
        System.out.println("min value of a float = " + Double.MIN_VALUE);

        float varFloat = 3.1416f;
        System.out.println("varFloat = " + varFloat);
    }
}
