package BinarySearch_Arrays;
/*
https://leetcode.com/problems/find-smallest-letter-greater-than-target/?envType=study-plan-v2&envId=binary-search
return statement has modulo operator to return the first corrector in case greater element does not exist.
 */
public class LeetCode744 {
    public static void main(String[] args) {
        char target='a';
        char[] arr={'c','f','j'};
        System.out.println(nextGreatestLetter(arr,target));

    }
    static char nextGreatestLetter(char[] letters, char target) {
        int start=0;
        int end=letters.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(target<letters[mid])
                end=mid-1;
            else
                start=mid+1;
        }
        return letters[start%letters.length];
    }
}
