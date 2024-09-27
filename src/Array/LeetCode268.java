package Array;
/*
https://leetcode.com/problems/missing-number/description/
 */
public class LeetCode268 {
    public static void main(String[] args) {

    }

    static int missingNumber(int[] nums) {
        int xor=0;
        int n=nums.length+1;
        for(int i=0;i<n;i++)
            xor^=i;
        for(int i=0;i<nums.length;i++)
            xor^=nums[i];
        return xor;

    }
}
/*
Bit manipulation -XOR

 */