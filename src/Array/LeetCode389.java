package Array;
/*
https://leetcode.com/problems/find-the-difference/?envType=problem-list-v2&envId=sorting&difficulty=EASY
 */
public class LeetCode389 {
    public static void main(String[] args) {

    }
    static public char findTheDifference(String s, String t) {
        int sum=0;
        for(int i=0; i<s.length(); i++){
            sum-=s.charAt(i);
        }
        for(int i=0;i<t.length();i++){
            sum+=t.charAt(i);
        }
        char ans=(char)sum;
        return ans;
    }
}
