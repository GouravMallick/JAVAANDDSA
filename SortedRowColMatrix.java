package com.gourav;

import java.util.Arrays;

public class SortedRowColMatrix {
    public static void main(String[] args) {
        //the 2D array is sorted in increasing order both column and row wise
        int[][] arr = { {10, 20, 30, 40},
                       {15, 25, 35, 45},
                       {28, 29, 37, 49},
                       {33, 34, 38, 50},

        };
        System.out.println(Arrays.toString(search(arr, 38)));

    }
    static int[] search(int[][] matrix, int target){
        int row =0;
        int column = matrix.length -1;

        while(row < matrix.length && column >= 0) {

            if (matrix[row][column] == target) {
                return new int[]{row, column};
            }
            if (matrix[row][column] < target) {
                row ++;
            }
            else if (matrix[row][column] > target) {
                column --;
            }
        }
        return new int[]{-1, -1};
    }
}
