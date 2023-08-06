package SearchingAlgorithm;

import java.util.Arrays;

public class BinarySearchMatrix {
    public static void main(String[] args) {
        int[][] ar={
                {10,20,30,40,41},
                {12,22,32,42},
                {15,25,35,45},
                {19,29,39,49}
        };
        System.out.println("Element found at index "+ Arrays.toString(binarySearch(ar,35)));

    }

    static int[] binarySearch(int[][] matrix,int target){
        int r=0;
        int c=matrix[0].length-1;
        while(r < matrix.length && c >=0)
        {
            if(matrix[r][c]==target)
            {
                return new int[]{r,c};
            }
            if(matrix[r][c] <target)
            {
                r++;
            }else{
                c--;
            }
        }

        return new int[]{-1,-1};
    }

}
