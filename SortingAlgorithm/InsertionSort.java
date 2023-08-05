package SortingAlgorithm;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] ar = {9,2,1,6,8,0,3,7};
        System.out.println(Arrays.toString(ar));
        insertionSort(ar);
        System.out.println(Arrays.toString(ar));
    }
    public static void insertionSort(int[] ar){
        for(int i=0;i<ar.length-1;i++)
        {
            for(int j=i+1;j>0;j--)
            {
                if(ar[j] < ar[j-1])
                {
                    int tmp=ar[j];
                    ar[j]=ar[j-1];
                    ar[j-1]=tmp;
                }else{
                    break;
                }
            }
        }
    }
}
