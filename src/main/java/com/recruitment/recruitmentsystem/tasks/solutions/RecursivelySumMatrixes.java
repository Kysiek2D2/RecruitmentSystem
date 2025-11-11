package com.recruitment.recruitmentsystem.tasks.solutions;

public class RecursivelySumMatrixes {

    public static void main(String[] args) {
        System.out.println("Hello World!");

        int[][] matrixA = {{1, 2},
                {3, 4}};
        int[][] matrixB = {{1, 2},
                {3, 4}};

        int[][] result = sumMatrixes(new int[matrixA.length][matrixA[0].length], matrixA, matrixB, 0, 0);

        printMatrix(result);
    }

    private static int[][] sumMatrixes(int[][] result, int[][] matrixA, int[][] matrixB, int row, int column) {
        int rows = matrixA.length;
        int columns = matrixA[0].length;

        result[row][column] = matrixA[row][column] + matrixB[row][column];
        if (column + 1 < columns) {
            result = sumMatrixes(result, matrixA, matrixB, row, column + 1);
        }
        else if(row + 1 < rows) {
            result = sumMatrixes(result, matrixA, matrixB, row + 1, 0);
        }
        return result;
    }

    private static void printMatrix(int[][] matrix) {
        for(int[] x : matrix){
            for(int y : x) {
                System.out.print(y+", ");
            }
            System.out.println();
        }
    }
}
