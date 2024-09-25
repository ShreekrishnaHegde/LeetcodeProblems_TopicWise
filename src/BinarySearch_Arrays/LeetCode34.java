package BinarySearch_Arrays;

import java.util.Arrays;

/*
https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/description/?envType=study-plan-v2&envId=binary-search
Ex: arr=[5,7,7,7,7,8,8,10} , if target element is 7, [1,4] should be returned.
---------Bruteforce approach--------------
->start searching from Left side using Linear search algorithm and stop once you find the target element,
    save the index.
->start searching from the Right side using L.S.A and stop once you find the target element and return both indices.
-> Time Complexity- O(N)

--------Binary Search---------
->First We need to find starting index and end index separately by applying binary search twice.
->To find start index , we need to remove right part of the array from search by decrementing end pointer i.e
    mid-1
then continuing the search till the while condition breaks.
-> To find the end index , we need to remove the left part of thee array from the search bt incrementing the
    start pointer i.e mid+1.
->In case if target element is not found, we need to return {-1,-1}.
 */
public class LeetCode34 {
    public static void main(String[] args) {
        int[] nums={5,7,7,7,7,8,8,10};
        int target=7;
        int[] ans={search(nums,target,true),search(nums,target,false)};
        System.out.println(Arrays.toString(ans));

    }

    static int search(int[] nums,int target,boolean findStartIndex){
        int ans=-1;
        int start=0;
        int end=nums.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(target<nums[mid])
                end=mid-1;
            else if(target>nums[mid])
                start=mid+1;
            else{
                ans=mid;
                if(findStartIndex)
                    end=mid-1;
                else
                    start=mid+1;
            }
        }
        return ans;
    }

}
