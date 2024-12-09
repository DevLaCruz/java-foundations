package arrays;

import java.util.Arrays;

public class ArraysExample {
    public static void main(String[] args) {

        String[] products = new String[7];
        products[0] = "Kingston Pendrive 64GB";
        products[1] = "Samsung Galaxy";
        products[2] = "Disco Duro SSD Samsung Externo";
        products[3] = "Asus Notebook";
        products[4] = "Macbook Air";
        products[5] = "Chromecast 4ta generación";
        products[6] = "Bicicleta Oxford";

        Arrays.sort(products);

        String prod1 = products[0];
        String prod2 = products[1];
        String prod3 = products[2];
        String prod4 = products[3];
        String prod5 = products[4];
        String prod6 = products[5];
        String prod7 = products[6];

        System.out.println("products[0] = " + prod1);
        System.out.println("products[1] = " + prod2);
        System.out.println("products[2] = " + prod3);
        System.out.println("products[3] = " + prod4);
        System.out.println("products[4] = " + prod5);
        System.out.println("products[5] = " + prod6);
        System.out.println("products[6] = " + prod7);

        int[] numbers = new int[4];

        numbers[0] = 10;
        numbers[1] = Integer.valueOf("7");
        numbers[2] = 35;
        numbers[3] = -1;
        // numbers[4] = 5;

        Arrays.sort(numbers);

        int i = numbers[0];
        int j = numbers[1];
        int k = numbers[2];
        int l = numbers[numbers.length - 1];
        //int m = numbers[4];

        System.out.println("i = " + i);
        System.out.println("j = " + j);
        System.out.println("k = " + k);
        System.out.println("l = " + l);
    }
}
