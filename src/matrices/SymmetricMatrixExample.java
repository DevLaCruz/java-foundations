package matrices;

public class SymmetricMatrixExample {
    public static void main(String[] args) {
        boolean isSymmetric = true;

        int[][] matrix = {
                {1, 2, 3, 4},
                {2, 1, 0, 5},
                {3, 0, 1, 6},
                {4, 5, 6, 7}
        };

        exit: for(int i = 0; i < matrix.length; i++){

            for(int j = 0; j < i; j++){
                if(matrix[i][j] != matrix[j][i]){
                    isSymmetric = false;
                    break exit;
                }
            }
        }

        if(isSymmetric){
            System.out.println("The matrix is symmetric");
        } else{
            System.out.println("The matrix is not symmetric");
        }
    }
}
