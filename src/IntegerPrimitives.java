public class IntegerPrimitives {
    public static void main(String[] args) {
        
        byte numByte = 127;
        System.out.println("numByte = " + numByte);
        System.out.println("byte type corresponds in byte to " + Byte.BYTES);
        System.out.println("byte type corresponds in bytes to " + Byte.SIZE);
        System.out.println("max value of a byte: " + Byte.MAX_VALUE);
        System.out.println("min value of a byte: " + Byte.MIN_VALUE);

        short numShort = 32767;
        System.out.println("numShort = " + numShort);
        System.out.println("short type corresponds en byte to " + Short.BYTES);
        System.out.println("short type corresponds en bytes to " + Short.SIZE);
        System.out.println("max value of a short: " + Short.MAX_VALUE);
        System.out.println("min value of a short: " + Short.MIN_VALUE);

        int numberInt = 2147483647;
        System.out.println("numberInt = " + numberInt);

        System.out.println("int type corresponds en byte to " + Integer.BYTES);
        System.out.println("int type corresponds en byte to " + Integer.SIZE);
        System.out.println("max value of a int: " + Integer.MAX_VALUE);
        System.out.println("min value of a int: " + Integer.MIN_VALUE);

        long numberLong = 9223372036854775807L;
        System.out.println("numberLong = " + numberLong);

        System.out.println("long type corresponds en byte to " + Long.BYTES);
        System.out.println("long type corresponds en byte to " + Long.SIZE);
        System.out.println("max value of a long: " + Long.MAX_VALUE);
        System.out.println("min value of a long: " + Long.MIN_VALUE);

        var numberVar = 9223372036854775808f;
        
    }
}
