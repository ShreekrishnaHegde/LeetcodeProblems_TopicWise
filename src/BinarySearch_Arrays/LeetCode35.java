package BinarySearch_Arrays;

/*
https://leetcode.com/problems/search-insert-position/description/?envType=study-plan-v2&envId=binary-search
->This question is similar to similar binary search
->When the condition of while breaks , the low and end high pointers cross each other.
->Hence high pointer will point to the element less than the target and low pointer will point to the element
    just greater than target, hence returning low pointer index / or high+1 will give the answer.
 */
public class LeetCode35 {
    public static void main(String[] args) {
        int[] arr={1,3,5,6};
        int target=4;
        System.out.println(searchInsert(arr,target));

    }

    static int searchInsert(int[] nums, int target) {
        int low=0;
        int high=nums.length-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(target==nums[mid])
                return mid;
            else if(target<nums[mid])
                high=mid-1;
            else
                low=mid+1;
        }
        return high+1;
    }
}
