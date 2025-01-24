package matrices;

public class MatrixSumRowsColumnsExample {
    public static void main(String[] args) {
        int rowSum, columnSum;
        int[][] a = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        for(int i = 0; i < a.length; i++){
            columnSum = 0;
            rowSum = 0;
            for(int j = 0; j < a[i].length; j++){
                rowSum += a[i][j];
                columnSum += a[j][i];
            }
            System.out.println("Row total " + i + ": " + rowSum);
            System.out.println("Column total " + i + ": " + columnSum);
        }

    }
}
