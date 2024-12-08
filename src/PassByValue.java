public class PassByValue {
    public static void main(String[] args) {

        int i = 10;

        System.out.println("Start the main method with i = " + i);
        test(i);
        System.out.println("Finish the main method with the value of i (remains the same) = " + i);
    }

    public static void test(int i){
        System.out.println("Start the main test with i = " + i);
        i = 35;
        System.out.println("Finish the main test with i = " + i);
    }
}
