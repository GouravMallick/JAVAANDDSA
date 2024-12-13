package com.gourav;

//LeetCode: https://leetcode.com/problems/find-in-mountain-array/description/

/*
Example 1:
Input: mountainArr = [1,2,3,4,5,3,1], target = 3
Output: 2
Explanation: 3 exists in the array, at index=2 and index=5. Return the minimum index, which is 2.

Example 2:
Input: mountainArr = [0,1,2,4,2,1], target = 3
Output: -1
Explanation: 3 does not exist in the array, so we return -1.
 */
public class FindInMountainArray {
    public static void main(String[] args) {
        int[] arr = {0,1,2,4,2,1};//{1,2,3,4,5,3,1};
        int target =3;
        int ans = search(arr, target);
        System.out.println(ans);
    }

    static int search( int[] arr, int target){
        int peak = peakIndexInMountainArray(arr); // return the peak index
        int firstTry = orderAgnosticBS(arr, target,0,peak);
        if(firstTry != -1){
            return firstTry;
        }
        return orderAgnosticBS(arr,target, peak+1, arr.length -1);
    }

    static int peakIndexInMountainArray(int[] arr){
        int start= 0;
        int end = arr.length -1;

        while(start < end){
            int mid = start + (end - start)/2;
            if(arr[mid] > arr[mid +1]){
                end = mid;
            }else if(arr[mid] < arr[mid+1]){
                start = mid+1;
            }
        }
        return start;

    }

    static int orderAgnosticBS(int[] arr, int target, int start, int end){
        Boolean isAsc = arr[start] < arr[end];

        while(start < end){
            int mid = start + (end- start)/2;

            if(target == arr[mid]){
                return mid;
            }

            if(isAsc){
                if(target < arr[mid]){
                    end= mid-1;
                }
                else if(target > arr[mid]){
                    start = mid +1;
                }
            }
            else{
                if(target < arr[mid]){
                    start= mid+1;
                }
                else if(target > arr[mid]){
                    end = mid -1;
                }
            }
        }
        return -1;
    }

}
