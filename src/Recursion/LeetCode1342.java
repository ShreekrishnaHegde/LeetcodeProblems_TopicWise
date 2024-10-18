package Recursion;
/*
https://leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero/description/
 */
public class LeetCode1342 {
    public static void main(String[] args) {

    }
    int count=0;
    public int numberOfSteps(int num) {

        reduce(num);
        return count;
    }
    void reduce(int n){
        if(n==0)
            return;
        else if(n%2==0){
            count++;
            reduce(n/2);
        }
        else{
            count++;
            reduce(n-1);
        }
    }
}


