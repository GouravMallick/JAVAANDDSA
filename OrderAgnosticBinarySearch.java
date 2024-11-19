package com.gourav;

public class OrderAgnosticBinarySearch {
    public static void main(String[] args) {
        int[] arr= {88,8,7,5,2,1}; //{-18,-12,-4,0,2,3,4,15,16,18,22,45,89};
        int target = 8;
        int ans = orderAgnosticBS(arr, target);
        System.out.println(ans);
    }
    static int orderAgnosticBS(int arr[], int target){
        int start= 0;
        int end = arr.length-1;
        boolean isAsc= arr[start] < arr[end];

        while(start <= end){

            int mid = start + (end - start) /2;

            if(arr[mid] == target){
                return mid;
            }
            if(isAsc){
                if(target < arr[mid]){
                        end = mid -1;
                }
                else if(target > arr[mid]){
                    start = mid +1;
                }
            } else{
                if(target > arr[mid]){
                    end = mid -1;
                }
                else if(target < arr[mid]){
                    start = mid +1;
                }
            }
        }
        return -1;
    }
}
