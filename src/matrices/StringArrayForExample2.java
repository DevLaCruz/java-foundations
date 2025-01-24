package matrices;

public class StringArrayForExample2 {
    public static void main(String[] args) {

        String[][] names = { {"Pepe", "Pepa"}, {"Josefa", "Paco"}, {"Lucas", "Pancha"}};

        for(String[] row: names){
            for(String name: row){
                System.out.print(name + "\t");
            }
            System.out.println();
        }

    }
}
