package arrays;
import java.util.Arrays;

public class ForReverseMutableArrayExample {

    public static void reverseArray(String[] arreglo){
        int total2 = arreglo.length;
        int total = arreglo.length;
        for(int i = 0; i < total2; i++){
            String actual = arreglo[i];
            String reverse = arreglo[total-1-i];
            arreglo[i] = reverse;
            arreglo[total-1-i] = actual;
            total2--;
        }
    }

    public static void main(String[] args) {

        String[] products = { "Kingston Pendrive 64GB", "Samsung Galaxy",
                "Disco Duro SSD Samsung Externo",
                "Asus Notebook", "Macbook Air",
                "Chromecast 4ta generación", "Bicicleta Oxford" };

        int total = products.length;

        Arrays.sort(products);
        reverseArray(products);

        //Collections.reverse(Arrays.asList(products));

        System.out.println("=== using for ===");
        for(int i = 0; i < total; i++){
            System.out.println("index " + i + " : " + products[i]);
        }
    }
}