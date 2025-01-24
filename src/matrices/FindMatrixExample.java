package matrices;

public class FindMatrixExample {
    public static void main(String[] args) {

        int[][] integersMatrix = {
                {35, 90, 3, 1978},
                {15, 2020, 10, 5},
                {677, 127, 32767, 1999}
        };

        int elementFound = 1999;
        boolean found = false;
        int i;
        int j = 0;
        find: for(i = 0; i < integersMatrix.length; i++){
            for(j = 0; j < integersMatrix[i].length; j++){
                if(integersMatrix[i][j] == elementFound){
                    found = true;
                    break find;
                }
            }
        }

        if(found){
            System.out.println("Found " + elementFound + " in the coordinates " + i + "," + j);
        } else {
            System.out.println(elementFound + " not found in the matrix!");
        }
    }
}
