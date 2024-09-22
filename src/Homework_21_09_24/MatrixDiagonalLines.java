package Homework_21_09_24;
// Հաշվում ենք մատրիցայի անկունագծերի թվերի գումարը

public class MatrixDiagonalLines {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3, 4, 10},
                {6, 1, 8, 10, 9},
                {3, 8, 10, 4, 5},
                {6, 10, 2, 1, 4},
                {10, 2, 3, 2, 1}
        };
        int sumFirstDiagonalNumbers = 0;
        int sumSecondDiagonalNumbers = 0;
        for (int i = 0, j= 0; i < matrix.length; i++, j++) {
            sumFirstDiagonalNumbers += matrix[i][j];
        }
        for ( int i = 0, j= matrix[i].length-1; i< matrix.length; i++, j--){
            sumSecondDiagonalNumbers += matrix[i][j];
        }
        System.out.println("Sum first diagonal line numbers of matrix is " +sumFirstDiagonalNumbers);
        System.out.println("Sum second diagonal line numbers of matrix is " +sumSecondDiagonalNumbers);
    }
}

