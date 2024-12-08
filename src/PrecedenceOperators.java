public class PrecedenceOperators {
    public static void main(String[] args) {

        int i = 14;
        int j = 8;
        int k = 20;

        double average = (i + j + k) / 3d;
        System.out.println("average = " + average);

        average = (i + j + k) / 3d * 10; // 14 + 8 + 0.6
        System.out.println("average = " + average);

        average = --i + j++ + k / 3d * 10; // (13 + 8) + 66.6
        System.out.println("average = " + average);
        System.out.println("i = " + i);
        System.out.println("j = " + j);
    }
}
