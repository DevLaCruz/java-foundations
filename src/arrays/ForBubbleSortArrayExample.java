package arrays;

public class ForBubbleSortArrayExample {

    public static void reverseArray(String[] array){
        int total2 = array.length;
        int total = array.length;
        for(int i = 0; i < total2; i++){
            String current = array[i];
            String reverse = array[total-1-i];
            array[i] = reverse;
            array[total-1-i] = current;
            total2--;
        }
    }

    public static void bubbleSort(Object[] array){

        int total = array.length;
        int contador = 0;

        for(int i = 0; i < total - 1; i++){
            for(int j = 0; j < total -1 -i; j++){
                if( ((Comparable) array[j+1]).compareTo(array[j]) > 0 ){
                    Object aux = array[j];
                    array[j] = array[j+1];
                    array[j+1] = aux;
                }
                contador++;
            }
        }

        System.out.println("contador = " + contador);
    }

    public static void main(String[] args) {

        String[] products = { "Kingston Pendrive 64GB", "Samsung Galaxy",
                "Disco Duro SSD Samsung Externo",
                "Asus Notebook", "Macbook Air",
                "Chromecast 4ta generación", "Bicicleta Oxford" };

        int total = products.length;

        bubbleSort(products);

        System.out.println("=== Usando for ===");
        for(int i = 0; i < total; i++){
            System.out.println("para indice " + i + " : " + products[i]);
        }

        Integer[] numbers = new Integer[4];

        numbers[0] = 10;
        numbers[1] = Integer.valueOf("7");
        numbers[2] = 35;
        numbers[3] = -1;

        bubbleSort(numbers);

        for(int i = 0; i < numbers.length; i++){
            System.out.println("i = " + i + " : " + numbers[i]);
        }
    }
}