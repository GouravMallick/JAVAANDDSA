package com.gourav;

import java.util.Arrays;

public class SequentialSortedRowColMatrix {
    public static void main(String[] args) {
        int[][] arr ={
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}
        };
        System.out.print(Arrays.toString(search(arr,16)));
    }

    public static  int[] binarySearch(int[][] matrix, int row, int cStart, int cEnd, int target){

        while(cStart <= cEnd){
            int mid = cStart + (cEnd - cStart)/2;

            if(matrix[row][mid] == target){
                return new int[]{row,mid};
            }
            if(matrix[row][mid] < target){
                cStart = mid+1;
            }
            else{
                cEnd = mid -1;
            }
        }
        return new int[]{-1,-1};
    }

    public static int[] search(int[][] matrix, int target){

        int row= matrix.length;
        int col= matrix[0].length;

       // System.out.print("Value of Row==>"+ row);
       // System.out.print("Value of Col==>"+ col);

        if( row ==1){
            return binarySearch(matrix, 0,0 , col -1, target);
        }

        int rStart = 0;
        int rEnd = row -1;
        int cMid = col /2;

        while(rStart < (rEnd -1)){

            int mid = rStart + (rEnd - rStart)/2;

            if(matrix[mid][cMid] == target){
                return new int[]{mid,cMid};
            }
            // in below logic I am trying to reduce my matrix space by eliminating unnecessary rows
            if(matrix[mid][cMid] < target){
                rStart = mid;
            }
            else{
                rEnd = mid;
            }
        }

        // now left with 2 rows, I will check the mid column of the 2 rows to check if my target element exist

        if(matrix[rStart][cMid] == target){
            return new int[]{rStart, cMid};
        }
        if(matrix[rStart +1][cMid] == target){
            return new int[]{rStart +1, cMid};
        }

        //Search In 1st Half
        if( target <= matrix[rStart][cMid-1]){
            return binarySearch(matrix, rStart,0, cMid-1, target);
        }
        //Search In 2nd Half
        if( target >= matrix[rStart][cMid+1] && target <= matrix[rStart][col-1]){
            return binarySearch(matrix, rStart,cMid +1, col-1, target);
        }
        //Search In 3rd Half
        if( target <= matrix[rStart+1][cMid-1]){
            return binarySearch(matrix, rStart+1,0, cMid-1, target);
        }
        //Search In 4th Half
        else{
            return binarySearch(matrix, rStart+1,cMid+1, col-1, target);
        }

        //return new int[]{-1, -1};

    }


}
