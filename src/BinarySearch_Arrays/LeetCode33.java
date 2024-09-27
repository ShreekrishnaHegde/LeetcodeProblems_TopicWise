package BinarySearch_Arrays;

import javax.xml.stream.events.StartDocument;

/*
https://leetcode.com/problems/search-in-rotated-sorted-array/
 */
public class LeetCode33 {
    public static void main(String[] args) {
        int[] nums={4,5,6,8,0,1,2,3};
        int target=3;
        int pivot=pivot(nums);
        int ans=search(nums,target,0,pivot);
        if(ans==-1) {
            ans=search(nums, target, pivot, nums.length - 1);
        }
    }

    static int pivot(int[] nums){
        int start=0;
        int end=nums.length-1;
        while (start<end){
            int mid=start+(end-start)/2;
            if(nums[mid]>nums[mid+1])
                return mid;
            else if(nums[start]>nums[mid])
                end=mid;
            else
                start=mid+1;
        }
        return -1;
    }
    static int search(int[] nums,int target,int start,int end){
        while(start<=end){
            int mid=start+(end-start)/2;
            if(target==nums[mid])
                return mid;
            else if(target>nums[mid])
                start=mid+1;
            else
                end=mid-1;
        }
        return -1;
    }
}
