package Array;
/*
https://leetcode.com/problems/single-number/description/
 */
public class LeetCode136 {
    public static void main(String[] args) {

    }
    static int singleNumber(int[] nums, int numsSize) {
        int odd=0;
        for(int i=0;i<numsSize;i++){
            odd^=nums[i];
        }
        return odd;
    }
}
