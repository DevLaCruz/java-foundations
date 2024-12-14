package arrays;
import java.util.Arrays;

public class ForArraysExample {
    public static void main(String[] args) {
        
        String[] products = new String[7];
        int total = products.length;

        products[0] = "Kingston Pendrive 64GB";
        products[1] = "Samsung Galaxy";
        products[2] = "Disco Duro SSD Samsung Externo";
        products[3] = "Asus Notebook";
        products[4] = "Macbook Air";
        products[5] = "Chromecast 4ta generación";
        products[6] = "Bicicleta Oxford";

        Arrays.sort(products);
        System.out.println("=== Using for ===");
        for(int i = 0; i < total; i++){
            System.out.println("for index " + i + " : " + products[i]);
        }
        System.out.println("=== Using foreach ===");
        for(String prod: products){
            System.out.println("prod = " + prod);
        }
        System.out.println("=== Using while ===");
        int i = 0;
        while(i < total){
            System.out.println("for index " + i + " : " + products[i]);
            i++;
        }

        System.out.println("=== Using do while ===");
        int j = 0;
        do {
            System.out.println("for index " + j + " : " + products[j]);
            j++;
        } while(j < total);

        int[] numbers = new int[10];

        int totalNumbers = numbers.length;
        for(int k = 0; k < totalNumbers; k++){
            numbers[k] = k*3;
        }

        for(int k = 0; k < totalNumbers; k++){
            System.out.println("numbers = " + numbers[k]);
        }

    }
}
