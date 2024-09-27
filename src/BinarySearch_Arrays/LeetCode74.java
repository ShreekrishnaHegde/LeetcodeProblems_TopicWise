package BinarySearch_Arrays;
/*
https://leetcode.com/problems/search-a-2d-matrix/description/
 */
public class LeetCode74 {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int target = 7;
        System.out.println(searchMatrix(matrix,target));
    }
    static boolean searchMatrix(int[][] matrix, int target) {
        int r=0;
        int c=matrix[0].length-1;
        while (r< matrix.length && c>=0){
            if (matrix[r][c]==target)
                return true;
            else if (matrix[r][c]<target)
                r++;
            else
                c--;
        }
        return false;
    }

}

