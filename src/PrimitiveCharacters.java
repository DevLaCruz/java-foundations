public class PrimitiveCharacters {
    public static void main(String[] args) {
        char character = '\u0040';
        char decimal = 64;
        System.out.println("character = " + character);
        System.out.println("decimal = " + decimal);
        System.out.println("decimal = character: " + (decimal == character));

        char symbol = '@';
        System.out.println("symbol = " + symbol);
        System.out.println("symbol = character: " + (symbol == character));

        char space = '\u0020';
        char recoil = '\b';
        char tabulator = '\t';
        char newLine = '\n';
        char returnCar = '\r';

        System.out.println("char corresponds en byte:" + System.lineSeparator() + Character.BYTES);
        System.out.println("Char corresponds en bites = " + Character.SIZE);
        System.out.println("Character.MIN_VALUE = " + Character.MIN_VALUE);
        System.out.println("Character.MAX_VALUE = " + Character.MAX_VALUE);
    }
}
