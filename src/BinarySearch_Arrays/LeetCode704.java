package BinarySearch_Arrays;
/*
https://leetcode.com/problems/binary-search/?envType=study-plan-v2&envId=binary-search
This question can be solved using simple binary search algorithm.
 */
public class LeetCode704 {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6};
        int target=9;
        System.out.println(search(arr,target));
    }

    static int search(int[] nums,int target){
        int start=0,end=nums.length-1;

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
