public class ConvertTypes {
    public static void main(String[] args) {
        String numberStr = "50";

        int numberInt = Integer.parseInt(numberStr);
        System.out.println("numberInt = " + numberInt);

        String realStr = "98765.43e-3";
        double realDouble = Double.parseDouble(realStr);
        System.out.println("realDouble = " + realDouble);

        String logicStr = "TruE";
        boolean logicBoolean = Boolean.parseBoolean(logicStr);
        System.out.println("logicBoolean = " + logicBoolean);

        int otherNumberInt = 100;

        System.out.println("otherNumberInt = " + otherNumberInt);

        String otherNumberStr = Integer.toString(otherNumberInt);
        System.out.println("otherNumberStr = " + otherNumberStr);

        otherNumberStr = String.valueOf(otherNumberInt+10);
        System.out.println("otherNumberStr = " + otherNumberStr);

        double otherRealDouble = 1.23456e2;
        String otherRealStr = Double.toString(otherRealDouble);
        System.out.println("otherRealStr = " + otherRealStr);

        otherRealStr = String.valueOf(1.23456e2f);
        System.out.println("otherRealStr = " + otherRealStr);
        
        int i = 22768;
        short s = (short) i;
        System.out.println("s = " + s);
        long l = i;
        System.out.println("l = " + l);
        System.out.println(Short.MAX_VALUE);
        char b = (char) i;
        System.out.println("b = " + b);
        float f = (float) i;
        System.out.println("f = " + f);
    }
}
