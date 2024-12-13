package com.gourav;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {-1, -12, -4 ,2 ,3 ,4 ,15 ,16 ,18 ,22 ,45};
        int target = -14;
        int ans = binarySearchElement(arr,target);
        System.out.print(ans);
    }

    static int binarySearchElement(int arr[],int target){
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start)/ 2;

            if(target < arr[mid]){
                end = mid -1;
            }
            else if(target > arr[mid]){
                start = mid +1;
            }
            else if(target == arr[mid])
                return mid;
        }
        return -1;
    }
}
