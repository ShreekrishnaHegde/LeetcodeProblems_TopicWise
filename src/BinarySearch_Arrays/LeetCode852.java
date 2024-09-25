package BinarySearch_Arrays;
/*
https://leetcode.com/problems/peak-index-in-a-mountain-array/description/?envType=study-plan-v2&envId=binary-search
->Ex: arr={0,2,3,4,5,4,3}
->if value at mid is > mid+1, mid "may be" the peak index,or it may lie before mid,right side of mid will be
    decreasing part of array and peak index will not be present there. Hence to reduce the
    search space we update the end value to mid.(but not mid -1 because end itself can be peak index)
-> if mid is < mid+1 , we are in increasing part of the array.So we update start to mid+1.Because mid is definitely
    not the peak index.
 */

public class LeetCode852 {
    public static void main(String[] args) {
        int[] arr={0,2,3,4,5,4,3};
        System.out.println(peakIndex(arr));
    }
    static int peakIndex(int[] arr){
        int start=0;
        int end=arr.length-1;
        while (start<end){
            int mid=start+(end-start)/2;
            if (arr[mid]>arr[mid+1])
                end=mid;
            else
                start=mid+1;
        }
        return end;
    }
}
